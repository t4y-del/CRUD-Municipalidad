package com.mycompany.municipalidad.persistencia;
import com.mycompany.municipalidad.logica.Individuo;
import com.mycompany.municipalidad.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import javax.persistence.Persistence;


public class IndividuoJpaController implements Serializable {

    
    
    public IndividuoJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public IndividuoJpaController(){
        emf = Persistence.createEntityManagerFactory("muniPU");
    }
    
    private EntityManagerFactory emf = null;
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public void create(Individuo individuo){
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(individuo);
            em.getTransaction().commit();
        } finally {
            if (em !=null){
                em.close();
            }
        }
    }
    
    public void edit(Individuo individuo) throws NonexistentEntityException, Exception{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            individuo = em.merge(individuo);
            em.getTransaction().commit();
        
        } catch (Exception ex){
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = individuo.getId();
                if (findIndividuo(id) == null){
                    throw new NonexistentEntityException("The Individuo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally { 
            if (em != null){
                em.close();
            }
        }
    }
    
    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Individuo individuo;
            try{
                individuo = em.getReference(Individuo.class, id);
                individuo.getId();
            } catch (EntityNotFoundException enfe){
                throw new NonexistentEntityException("The Individuo with id " + id + " no longer exists.");
            }
            em.remove(individuo);
            em.getTransaction().commit();
        } finally {
            if (em != null){
                em.close();
            }
        }
    }
    
    
    public List<Individuo> findIndividuoEntities(){
        return findIndividuoEntities(true, -1, -1);
    }
    
    public List<Individuo> findIndividuoEntities(int maxResults, int firstResult){
        return findIndividuoEntities(false, maxResults, firstResult);
    }
    
        private List<Individuo> findIndividuoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try{
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Individuo.class));
            Query q = em.createQuery(cq);
            if (!all){
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
                }
            return q.getResultList();
            } finally {
                em.close();
            }
        }
    
    public Individuo findIndividuo(int id){
        EntityManager em = getEntityManager();
        try{
            return em.find(Individuo.class, id);
        } finally { 
            em.close();
        }
    
    }
    
    public int getIndividuoCount(){
        EntityManager em = getEntityManager();
        try{
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Individuo> rt = cq.from(Individuo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
    

