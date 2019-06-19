package Project_Vete;

public class Veterinaria {

	/**
	*Esta clase define  Definicion de arreglos  correspondientes
	* @author Jhon H Riaño
	*/

	Dueño[] dueño;
	Mascota[] mascota;
	Veterinario[] Veterinario;

	/**
	*Esta clase define Contructor  correspondientes
	* @author Jhon H Riaño
	*/
	public Veterinaria(int cantdueños)
	{
		dueño=new Dueño[cantdueños];

	}
	/**
	*Esta clase define Contructor  correspondientes
	* @author Jhon H Riaño
	*/
	public Veterinaria(Mascota[] mascota) {
		this.mascota = mascota;
	}

	public Veterinaria(Veterinario[] doctor) {
		this.Veterinario = doctor;
	}

	/**
	*Esta clase define Creacion Dueño  correspondientes
	* @author Jhon H Riaño
	*/
	
	public void Creardueño(Dueño c)
	{
		for(int i=0;i<dueño.length;i++) {
			if(dueño[i]==null) {
				dueño[i]=c;
			}
		}
	}
	/**
	*Esta clase define Crear mascota  correspondientes
	* @author Jhon H Riaño
	*/

	public void Crearmascota(Mascota m)
	{
		for(int i=0;i<mascota.length;i++) {
			if(mascota[i]==null) {
				mascota[i]=m;
			}
		}
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

}


