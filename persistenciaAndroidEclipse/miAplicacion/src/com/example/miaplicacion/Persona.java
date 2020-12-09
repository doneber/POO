package com.example.miaplicacion;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private int ci;
    public Persona(){
        this.nombre="Jose";
        this.ci= 56778912;
    }
    public Persona(String nom, int ci){
        this.nombre= nom;
        this.ci= ci;
    }
    public void mostrar(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Ci: "+ this.ci);
    }
    public int getCi(){
        return this.ci;
    }
    public String getNombre(){
    	return this.nombre;
    }
}
