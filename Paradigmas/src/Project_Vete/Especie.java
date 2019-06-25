package Project_Vete;

/**
*Esta clase define objetos Especie con gets,Set y Contructor  correspondientes
* @author Jhon H Riaño
*/

public class Especie {
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

 
    public String toString() {
        return "Especie{" + "especie=" + especie + '}';
    }

    public Especie(String especie) {
        this.especie = especie;
    }

	public static void add(Especie especie2) {
		
		
	}
    
    
}
