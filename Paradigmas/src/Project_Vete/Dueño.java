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
public class Dueño {
    private int idClien;
    private String nombreClien;
    private String apellidoClien;
    private String DireccionClien;
    private int telefonoClient;
    private Date fechapasoClien;

    public int getIdClien() {
        return idClien;
    }

    public void setIdClien(int idClien) {
        this.idClien = idClien;
    }

    public String getNombreClien() {
        return nombreClien;
    }

    public void setNombreClien(String nombreClien) {
        this.nombreClien = nombreClien;
    }

    public String getApellidoClien() {
        return apellidoClien;
    }

    public void setApellidoClien(String apellidoClien) {
        this.apellidoClien = apellidoClien;
    }

    public String getDireccionClien() {
        return DireccionClien;
    }

    public void setDireccionClien(String DireccionClien) {
        this.DireccionClien = DireccionClien;
    }

    public int getTelefonoClient() {
        return telefonoClient;
    }

    public void setTelefonoClient(int telefonoClient) {
        this.telefonoClient = telefonoClient;
    }

    public Date getFechapasoClien() {
        return fechapasoClien;
    }

    public void setFechapasoClien(Date fechapasoClien) {
        this.fechapasoClien = fechapasoClien;
    }

    public Dueño(int idClien, String nombreClien, String apellidoClien, String DireccionClien, int telefonoClient, Date fechapasoClien) {
        this.idClien = idClien;
        this.nombreClien = nombreClien;
        this.apellidoClien = apellidoClien;
        this.DireccionClien = DireccionClien;
        this.telefonoClient = telefonoClient;
        this.fechapasoClien = fechapasoClien;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "idClien=" + idClien + ", nombreClien=" + nombreClien + ", apellidoClien=" + apellidoClien + ", DireccionClien=" + DireccionClien + ", telefonoClient=" + telefonoClient + ", fechapasoClien=" + fechapasoClien + '}';
    }
    
    
}

