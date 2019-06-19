package Project_Vete;

public class Veterinaria {

	// Definicion de arreglos @Jhon Ria�o	
		Due�o[] due�o;
		Mascota[] mascota;
		Doctor[] doctor;
		
		//Definici�n de listas @Wilson Gutierrez
		ArrayList<Especie> esp = new ArrayList<Especie>();
		ArrayList<Raza> laraza = new ArrayList<Raza>();
		ArrayList<Due�o> eldueno = new ArrayList<Due�o>();

		//Constructor @Jhon Ria�o
		/**
		 * @author Jhon Ria�o 
		 * @param cantdue�os 
		 */
		public Veterinaria(int cantdue�os)
		{
			due�o=new Due�o[cantdue�os];

		}
		//Constructor@Jhon Ria�o
		/**
		 * @author Jhon Ria�o
		 * @param mascota
		 */
		public Veterinaria(Mascota[] mascota) {
			this.mascota = mascota;
		}

		/**
		 * @author Jhon Ria�o
		 * @param doctor
		 */
		public Veterinaria(Doctor[] doctor) {
			this.doctor = doctor;
		}

		//Creacion Due�o @Jhon Ria�o
		/**
		 * @author Jhon Ria�o
		 * @param c
		 */
		public void Creardue�o(Due�o c)
		{
			for(int i=0;i<due�o.length;i++) {
				if(due�o[i]==null) {
					due�o[i]=c;
				}
			}
		}
		//Crear mascota @Jhon Ria�o
		/**
		 * @author Jhon Ria�o
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
		//Crear Veterinario @Jhon Ria�o
		/**
		 * @author Jhon Ria�o
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
		 * Metodo para crear los datos de un due�o de mascota
		 * @author Wilson Gutierrez
		 * @param idCl Identificaci�n del cliente
		 * @param nmCl nombre del cliente 
		 * @param apCl Apellido del cliente
		 * @param DirCl Direcci�n 
		 * @param telCl Telefono de contacto
		 * @param fecha Fecha en la que se registr� el cliente
		 */
		public void creardueno ( int idCl, 
	    		String nmCl, 
	    		String apCl, 
	    		String DirCl, 
	    		int telCl, 
	    		Date fecha) {		
			eldueno.add(new Due�o(idCl, nmCl, apCl, DirCl, telCl, fecha));		
		}

<<<<<<< HEAD
	//Crear Veterinario @Jhon Ria�o
	public void Crearveterinario(Veterinario v)
=======
	/**
	*Esta clase define Crear Veterinario  correspondientes
	* @author Jhon H Ria�o
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




