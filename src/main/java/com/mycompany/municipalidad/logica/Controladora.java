//CONTROLADORA DE LA LOGICA

/*
    RECIBE PETICIONES DE INTERFAZ GRAFICA, MANDA DATOS PARA PERSISTENCIA ETC. 
*/

package com.mycompany.municipalidad.logica;

import com.mycompany.municipalidad.persistencia.ControladoraPersistencia;
import java.util.List;



public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearIndividuo(String nombre, int legajo, String demandante, int monto, String fecha) {                     
                                                                                //RESIVE LOS DATOS DE CREARINVIDIVUDO (DESDE GUI) 
        
        Individuo indiv = new Individuo();                                      //CREA EL OBJETO
        indiv.setNombre(nombre);
        indiv.setLegajo(legajo);
        indiv.setDemandante(demandante);
        indiv.setMonto(monto);
        indiv.setFecha(fecha);
        
        
        controlPersis.crearIndividuo (indiv);                                    //LLAMA A LA PERSISTENCIA Y LE PASA EL OBJETO CREADO (EL INDIVIDUO)
    }

    public List<Individuo> traerIndividuos() {                                  //Tiene que trar una lista de Individuos 
        return controlPersis.traerIndividuos();
    }

    public void borrarIndiv(int Id) {
        controlPersis.borrarIndividuos(Id);
    }

    public Individuo traerIndividuos(int Id) {
        return controlPersis.traerIndividuos(Id);
    }




    public void modificarIndividuo(Individuo indiv, String nombre, int legajo, String demandante, int monto, String fecha) {
        indiv.setNombre(nombre);
        indiv.setLegajo(legajo);
        indiv.setDemandante(demandante);
        indiv.setMonto(monto);
        indiv.setFecha(fecha);
        
        //le pido a la persistencia que modifique
        controlPersis.modificarIndivuo(indiv);
    }

    
    
       

}
