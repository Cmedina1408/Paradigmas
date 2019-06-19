package Project_Vete;


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

 
    public String toString() {
        return "Informacion" + "\nid=" + idPerson + "\nnombre=" + nombrePerson + "\tapellido=" + apellidoPerson + "\nDireccion=" + DireccionPerson + "\ttelefono=" + telefonoPerson;
    }
}
    
    