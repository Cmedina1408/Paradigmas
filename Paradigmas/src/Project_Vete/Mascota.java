package Project_Vete;


import java.util.*;

/**
*Esta clase define objetos Mascota con gets,Set y Contructor  correspondientes
* @author Jhon H Riaño
*/
public class Mascota {
    
	/**
	*Esta clase define objetos Definicion de variables segun diagrama de clases Uml correspondientes
	* @author Jhon H Riaño
	*/
	
    private int numregistroMas;
    private String nombreMas;
    private int edadMas;
    private String GeneroMas;
    private Date fechanaciMas;
    private String especie;
	private  ArrayList<String> nombreDueno = new ArrayList<String>(); //Array para guardar los nombres de los dueños
   	private  ArrayList<Date> fechaTrasp = new ArrayList<Date>(); //Array para guardar la fecha de los traspasos

    public Mascota(int numregistroMas, 
    		String nombreMas, 
    		int edadMas, 
    		String GeneroMas, 
    		Date fechanaciMas, 
    		String especie) {
        this.numregistroMas = numregistroMas;
        this.nombreMas = nombreMas;
        this.edadMas = edadMas;
        this.GeneroMas = GeneroMas;
        this.fechanaciMas = fechanaciMas;
        this.especie = especie;
    }
    
    
       
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
    
   
    /**
     * Guarda el registro del dueño y la fecha en la cual se realizo el traspaso
     * @author WILSON GUTIERREZ LANCHEROS
     * @param nm nombre del dueño de la mascota
     */
  
     public void guardarDuenoMascota (String nm)  {   	   
	   nombreDueno.add(nm);   	     	   	   
   } 

   /**
    * Guarda el registro de la fecha en la cual se realizo el traspaso
    * @author WILSON GUTIERREZ LANCHEROS 
    * @param fechaT fecha de traspaso
    */
  
    public void guardarFechaT (Date fechaT)  {   	   
	  fechaTrasp.add(fechaT);   	     	   	   
  } 

    
    public String toString() {
        return "Mascota{" + "numregistroMas=" + numregistroMas + ", nombreMas=" + nombreMas + ", edadMas=" + edadMas + ", GeneroMas=" + GeneroMas + ", fechanaciMas=" + fechanaciMas + ", especie=" + especie + '}';
    }
        
}