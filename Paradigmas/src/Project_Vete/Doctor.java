package Project_Vete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paradigmas
 */
public class Doctor {
    private int idDoctor;
    private String nombreDoctor;
    private String apellidoDoctor;
    private String direccionDoctor;
    private int telefonoDoctor;
    private  int profesionDoctor;
    private int especialidadDoctor;

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public String getDireccionDoctor() {
        return direccionDoctor;
    }

    public void setDireccionDoctor(String direccionDoctor) {
        this.direccionDoctor = direccionDoctor;
    }

    public int getTelefonoDoctor() {
        return telefonoDoctor;
    }

    public void setTelefonoDoctor(int telefonoDoctor) {
        this.telefonoDoctor = telefonoDoctor;
    }

    public int getProfesionDoctor() {
        return profesionDoctor;
    }

    public void setProfesionDoctor(int profesionDoctor) {
        this.profesionDoctor = profesionDoctor;
    }

    public int getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(int especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public Doctor(int idDoctor, String nombreDoctor, String apellidoDoctor, String direccionDoctor, int telefonoDoctor, int profesionDoctor, int especialidadDoctor) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.direccionDoctor = direccionDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.profesionDoctor = profesionDoctor;
        this.especialidadDoctor = especialidadDoctor;
    }

    @Override
    public String toString() {
        return "Doctor{" + "idDoctor=" + idDoctor + ", nombreDoctor=" + nombreDoctor + ", apellidoDoctor=" + apellidoDoctor + ", direccionDoctor=" + direccionDoctor + ", telefonoDoctor=" + telefonoDoctor + ", profesionDoctor=" + profesionDoctor + ", especialidadDoctor=" + especialidadDoctor + '}';
    }
 
}

