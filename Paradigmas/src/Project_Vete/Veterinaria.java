package Project_Vete;

import java.util.ArrayList;
import java.util.Date;

public class Veterinaria {

	// Definicion de arreglos @Jhon Ria�o	
		Dueno[] dueno;
		Mascota[] mascota;
		Veterinario[] Veterinario1;
		
		//Definici�n de listas @Wilson Gutierrez
		ArrayList<Especie> esp = new ArrayList<Especie>();
		ArrayList<Raza> laraza = new ArrayList<Raza>();
		ArrayList<Dueno> eldueno = new ArrayList<Dueno>();
		private Veterinario[] Veterinario;

		//Constructor @Jhon Ria�o
		/**
		 * @author Jhon Ria�o 
		 * @param cantdue�os 
		 */
		public Veterinaria(int cantdue�os)
		{
			dueno = new Dueno[cantdue�os];

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
		public Veterinaria(Veterinario[] Veterinario) {
			this.Veterinario1 = Veterinario;
		}

		//Creacion Due�o @Jhon Ria�o
		/**
		 * @author Jhon Ria�o
		 * @param c
		 */
		public void Creardue�o(Dueno c)
		{
			for(int i=0;i<dueno.length;i++) {
				if(dueno[i]==null) {
					dueno[i]=c;
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
			Dueno.add(new Dueno(idCl, nmCl, apCl, DirCl, telCl, fecha));		
		}


	

/**
 * @param Metodo para crear Veterinario
 * @author Jhon Ria�o
 
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




