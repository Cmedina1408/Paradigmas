package Project_Vete;

import java.util.ArrayList;
import java.util.Date;

public class Veterinaria {

	// Definicion de arreglos @Jhon Riaño	
		Dueno[] dueno;
		Mascota[] mascota;
		Veterinario[] Veterinario1;
		
		//Definición de listas @Wilson Gutierrez
		ArrayList<Especie> esp = new ArrayList<Especie>();
		ArrayList<Raza> laraza = new ArrayList<Raza>();
		ArrayList<Dueno> eldueno = new ArrayList<Dueno>();
		private Veterinario[] Veterinario;

		//Constructor @Jhon Riaño
		/**
		 * @author Jhon Riaño 
		 * @param cantdueños 
		 */
		public Veterinaria(int cantdueños)
		{
			dueno = new Dueno[cantdueños];

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
		public Veterinaria(Veterinario[] Veterinario) {
			this.Veterinario1 = Veterinario;
		}

		//Creacion Dueño @Jhon Riaño
		/**
		 * @author Jhon Riaño
		 * @param c
		 */
		public void Creardueño(Dueno c)
		{
			for(int i=0;i<dueno.length;i++) {
				if(dueno[i]==null) {
					dueno[i]=c;
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
		public void Crearveterinario(Veterinario v)
		{
			for(int i=0;i<Veterinario1.length;i++) {
				if(Veterinario1[i]==null) {
					Veterinario1[i]=v;
				}
			}
		}
		
		/**
		 * Metodo para insertar una nueva especie
		 * @author Wilson Gutierrez
		 * @param e contiene el valor de la nueva especie
		 */
		public void crearespecie (String e) {		
			Especie.add(new Especie(e));		
		}
	/**
	 * Metodo para guardar una nueva raza
	 * @author Wilson Gutierrez
	 * @param r contiene el valor de la nueva raza
	 */
		public void crearraza (String r) {		
			Raza.add(new Raza(r));		
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
			Dueno.add(new Dueno(idCl, nmCl, apCl, DirCl, telCl, fecha));		
		}


	

/**
 * @param Metodo para crear Veterinario
 * @author Jhon Riaño
 
 */
	
	public void Crearveterinario1(Veterinario v)

	{
		for(int i=0;i<Veterinario1.length;i++) {
			if(Veterinario1[i]==null) {
				Veterinario1[i]=v;
			}
		}
	}
	}




