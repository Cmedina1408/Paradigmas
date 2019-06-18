package Project_Vete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
*Esta clase define objetos Persona con gets,Set y Contructor  correspondientes
* @author Jhon H Riaño
*/
public class Persona {
    private int idPerson;
    private String nombrePerson;
    private String apellidoPerson;
    private String DireccionPerson;
    private int telefonoPerson;
        
    
    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNombrePerson() {
        return nombrePerson;
    }

    public void setNombrePerson(String nombrePerson) {
        this.nombrePerson = nombrePerson;
    }

    public String getApellidoPerson() {
        return apellidoPerson;
    }

    public void setApellidoPerson(String apellidoPerson) {
        this.apellidoPerson = apellidoPerson;
    }

    public String getDireccionPerson() {
        return DireccionPerson;
    }

    public void setDireccionPerson(String DireccionPerson) {
        this.DireccionPerson = DireccionPerson;
    }

    public int getTelefonoPerson() {
        return telefonoPerson;
    }

    public void setTelefonoPerson(int telefonoPerson) {
        this.telefonoPerson = telefonoPerson;
    }

    public Persona(int idPerson, 
    		String nombrePerson, 
    		String apellidoPerson, 
    		String DireccionPerson, 
    		int telefonoPerson) {
        this.idPerson = idPerson;
        this.nombrePerson = nombrePerson;
        this.apellidoPerson = apellidoPerson;
        this.DireccionPerson = DireccionPerson;
        this.telefonoPerson = telefonoPerson;
    
    }

    @Override
    public String toString() {
        return "Informacion" + "\nid=" + idPerson + "\nnombre=" + nombrePerson + "\tapellido=" + apellidoPerson + "\nDireccion=" + DireccionPerson + "\ttelefono=" + telefonoPerson;
    }
}
    
    