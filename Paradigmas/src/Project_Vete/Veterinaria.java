package Project_Vete;

public class Veterinaria {

	// Definicion de arreglos @Jhon Riaño	
		Dueño[] dueño;
		Mascota[] mascota;
		Doctor[] doctor;
		
		//Definición de listas @Wilson Gutierrez
		ArrayList<Especie> esp = new ArrayList<Especie>();
		ArrayList<Raza> laraza = new ArrayList<Raza>();
		ArrayList<Dueño> eldueno = new ArrayList<Dueño>();

		//Constructor @Jhon Riaño
		/**
		 * @author Jhon Riaño 
		 * @param cantdueños 
		 */
		public Veterinaria(int cantdueños)
		{
			dueño=new Dueño[cantdueños];

		}
		//Constructor@Jhon Riaño
		/**
		 * @author Jhon Riaño
		 * @param mascota
		 */
		public Veterinaria(Mascota[] mascota) {
			this.mascota = mascota;
		}

		/**
		 * @author Jhon Riaño
		 * @param doctor
		 */
		public Veterinaria(Doctor[] doctor) {
			this.doctor = doctor;
		}

		//Creacion Dueño @Jhon Riaño
		/**
		 * @author Jhon Riaño
		 * @param c
		 */
		public void Creardueño(Dueño c)
		{
			for(int i=0;i<dueño.length;i++) {
				if(dueño[i]==null) {
					dueño[i]=c;
				}
			}
		}
		//Crear mascota @Jhon Riaño
		/**
		 * @author Jhon Riaño
		 * @param m
		 */
		public void Crearmascota(Mascota m)
		{
			for(int i=0;i<mascota.length;i++) {
				if(mascota[i]==null) {
					mascota[i]=m;
				}
			}
		}
		//Crear Veterinario @Jhon Riaño
		/**
		 * @author Jhon Riaño
		 * @param v
		 */
		public void Crearveterinario(Doctor v)
		{
			for(int i=0;i<doctor.length;i++) {
				if(doctor[i]==null) {
					doctor[i]=v;
				}
			}
		}
		
		/**
		 * Metodo para insertar una nueva especie
		 * @author Wilson Gutierrez
		 * @param e contiene el valor de la nueva especie
		 */
		public void crearespecie (String e) {		
			esp.add(new Especie(e));		
		}
	/**
	 * Metodo para guardar una nueva raza
	 * @author Wilson Gutierrez
	 * @param r contiene el valor de la nueva raza
	 */
		public void crearraza (String r) {		
			laraza.add(new Raza(r));		
		}
		/**
		 * Metodo para crear los datos de un dueño de mascota
		 * @author Wilson Gutierrez
		 * @param idCl Identificación del cliente
		 * @param nmCl nombre del cliente 
		 * @param apCl Apellido del cliente
		 * @param DirCl Dirección 
		 * @param telCl Telefono de contacto
		 * @param fecha Fecha en la que se registró el cliente
		 */
		public void creardueno ( int idCl, 
	    		String nmCl, 
	    		String apCl, 
	    		String DirCl, 
	    		int telCl, 
	    		Date fecha) {		
			eldueno.add(new Dueño(idCl, nmCl, apCl, DirCl, telCl, fecha));		
		}

<<<<<<< HEAD
	//Crear Veterinario @Jhon Riaño
	public void Crearveterinario(Veterinario v)
=======
	/**
	*Esta clase define Crear Veterinario  correspondientes
	* @author Jhon H Riaño
	*/
	
	public void Crearveterinario(Doctor v)
>>>>>>> branch 'master' of https://github.com/damanchola1/Paradigmas.git
	{
		for(int i=0;i<Veterinario.length;i++) {
			if(Veterinario[i]==null) {
				Veterinario[i]=v;
			}
		}
	}




