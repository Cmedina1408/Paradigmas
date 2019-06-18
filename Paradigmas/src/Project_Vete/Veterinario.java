package Project_Vete;


public class Veterinario extends Persona{
	
	private String Profesion;
	private String Especializacion;
	
	public Veterinario(int idPerson, String nombrePerson, String apellidoPerson, String DireccionPerson,
			int telefonoPerson , String Profesion , String Especializacion) {
		super(idPerson, nombrePerson, apellidoPerson, DireccionPerson, telefonoPerson);
		
		this.Profesion = Profesion;
		this.Especializacion = Especializacion;
		
	}

	public String get_Profesion() {
		return "Profesion: " + Profesion;
	}
	public void set_Profesion(String Profesion) {
		this.Profesion = Profesion;
	}
	
	public String get_Especializacion() {
		return "Especializacion: " + Especializacion;
	}
	
	public void set_Especializacion(String Especializacion) {
		this.Especializacion = Especializacion;
	}
	
	public String toString() {
		return super.toString() + "\tProfesion : " + Profesion + "\tEspecializacion : " + Especializacion;
	}
	
}

