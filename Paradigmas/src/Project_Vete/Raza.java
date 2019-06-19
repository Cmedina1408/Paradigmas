package Project_Vete;

/**
 * Esta clase se encarga de contener una raza
 * @author WILSON GUTIERREZ LANCHEROS
 * @version 2019/06
 *
 */

public class Raza {

	private String nombreRaza;

	/**
	 * Metodo que entrega el nombre de la raza
	 * @return entrega un valorde cadena de texto.
	 */
	public String getNombreRaza() {
		return nombreRaza;
	}
/**
 * metodo que obtiene el nombre de la raza
 * @param nombreRaza Se utiliza para guardar el nombre de la raza
 */
	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

	/**Constructor con variables de la clase
	 * @param nombreRaza Se utiliza para guardar el nombre de la raza
	 */
	public Raza(String nombreRaza) {		
		this.nombreRaza = nombreRaza;
	}

	/**
	 * Segundo constructor
	 */
	public Raza() {		
		nombreRaza = "";
	}
	public static void add(Raza raza) {

		
	}
			
	
}
