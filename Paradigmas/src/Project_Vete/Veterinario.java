package Project_Vete;



public class Veterinario {

	public int idVete;
	public String nombreVete;
	public String profesion;
	public String direccion;
	public long telefono;


	public int getIdVete() {
		return idVete;
	}

	public void setIdVete(int idVete) {
		this.idVete = idVete;
	}

	public String getNombreVete() {
		return nombreVete;
	}

	public void setNombreVete(String nombreVete) {
		this.nombreVete = nombreVete;
	}

	@Override
	public String toString() {
		return "Empleado " + idVete + " " + nombreVete + " " + profesion + " " + 
				" " + direccion + " " + telefono ;
	}

	public Veterinario(int idVete, String nombreVete, String profesion
			, String direccion , long telefono ) {
		this.idVete = idVete;
		this.nombreVete = nombreVete;
		this.profesion = profesion;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public static void main(String[] args) {

	}

}

