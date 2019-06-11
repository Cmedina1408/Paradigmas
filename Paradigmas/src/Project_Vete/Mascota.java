package Project_Vete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Paradigmas
 */
public class Mascota {
    
    private int numregistroMas;
    private String nombreMas;
    private int edadMas;
    private String GeneroMas;
    private Date fechanaciMas;
    private String especie;

    public int getNumregistroMas() {
        return numregistroMas;
    }

    public void setNumregistroMas(int numregistroMas) {
        this.numregistroMas = numregistroMas;
    }

    public String getNombreMas() {
        return nombreMas;
    }

    public void setNombreMas(String nombreMas) {
        this.nombreMas = nombreMas;
    }

    public int getEdadMas() {
        return edadMas;
    }

    public void setEdadMas(int edadMas) {
        this.edadMas = edadMas;
    }

    public String getGeneroMas() {
        return GeneroMas;
    }

    public void setGeneroMas(String GeneroMas) {
        this.GeneroMas = GeneroMas;
    }

    public Date getFechanaciMas() {
        return fechanaciMas;
    }

    public void setFechanaciMas(Date fechanaciMas) {
        this.fechanaciMas = fechanaciMas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Mascota(int numregistroMas, String nombreMas, int edadMas, String GeneroMas, Date fechanaciMas, String especie) {
        this.numregistroMas = numregistroMas;
        this.nombreMas = nombreMas;
        this.edadMas = edadMas;
        this.GeneroMas = GeneroMas;
        this.fechanaciMas = fechanaciMas;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascota{" + "numregistroMas=" + numregistroMas + ", nombreMas=" + nombreMas + ", edadMas=" + edadMas + ", GeneroMas=" + GeneroMas + ", fechanaciMas=" + fechanaciMas + ", especie=" + especie + '}';
    }
        
}

