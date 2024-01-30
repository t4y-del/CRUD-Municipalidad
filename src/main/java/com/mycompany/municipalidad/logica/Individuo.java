
package com.mycompany.municipalidad.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Individuo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nombre;
    private int legajo;
    private String demandante;
    private int monto;
    private String fecha;
    public Individuo() {
    }
    
    
    
    public Individuo(int id, String nombre, int legajo, String demandante, int monto, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.legajo = legajo;
        this.demandante = demandante;
        this.monto = monto;
        this.fecha = fecha;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    public String getDemandante() {
        return demandante;
    }

    public void setDemandante(String demandante) {
        this.demandante = demandante;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
    
        
   
   
    
    
}
