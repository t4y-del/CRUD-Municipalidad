package com.mycompany.municipalidad.persistencia;

import com.mycompany.municipalidad.logica.Individuo;
import com.mycompany.municipalidad.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    IndividuoJpaController indivJpa = new IndividuoJpaController();
    

    
    public void crearIndividuo(Individuo indiv) { //AGREGA EL INDIVIDUO MEDIANTE JPA A LA BASE DE DATOS
        indivJpa.create(indiv);
    }

    public List<Individuo> traerIndividuos() {
        return indivJpa.findIndividuoEntities();
    }

    public void borrarIndividuos(int Id) {
        //Esto es un try catch por si se envia un registro que no existe, si no lo logra nos permite volver a intentar y no crashea.
        try {
            indivJpa.destroy(Id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Individuo traerIndividuos(int Id) {
        return indivJpa.findIndividuo(Id);
    }

    public void modificarIndivuo(Individuo indiv) {
        try {
            indivJpa.edit(indiv);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}



