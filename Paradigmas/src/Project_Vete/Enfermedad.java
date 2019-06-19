package Project_Vete;

/**
 * Esta clase valida las enfermedades más comunes de los animales registrando
 * las detectadas por el veterinario y valida su criticidad
 * @author WILSON GUTIERREZ LANCHEROS
 * @version 2019/06
 *
 */
public class Enfermedad {
	
	//Variables de la clase
	private String nombreEnfermedad;
	private boolean cronica = false;
	private String descripcion;
	
	/**
	 * Metodo para resolver el valor de enfermedad
	 * @return entrega el nombre de la enfermedad tipo string
	 */
	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}
	/**
	 * Metodo encargado de recibir y crear un nuevo valor para el nombre de la enfermedad.
	 * @param nombreEnfermedad
	 */
	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}
	/**
	 * Metodo para resolver si es verdadero o falso que la enfermedad sea cronica
	 * @return devuelve como valor tipo booleano si es cronica una enfermedad.
	 */
	public boolean isCronica() {
		return cronica;	
	}
	/**
	 * Metodo encargado de recibir y crear un nuevo valor para la enfermedad cronica.
	 */
	public void setCronica(boolean cronica) {
		this.cronica = cronica;	
	}
	/**
	 * Metodo que entrega la descripción de una enfermedad	
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Metodo que recibe la descripción de una enfermedad
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @param nombreEnfermedad inicializa el valor de la enfermedad como tipo String
	 * @param cronica inicializa el valor de cronica como tipo bool
	 * @param descripcion inicializa el valor de descripcio como tipo String 
	 */
	public Enfermedad(String nombreEnfermedad, boolean cronica, String descripcion) {
		super();
		this.nombreEnfermedad = nombreEnfermedad;
		this.cronica = cronica;
		this.descripcion = descripcion;
	}
	/**
	 * 
	 */
	public Enfermedad() {
		super();
		
	}
	


}
