package Project_Vete;

public class Veterinaria {

	/**
	*Esta clase define  Definicion de arreglos  correspondientes
	* @author Jhon H Ria�o
	*/

	Due�o[] due�o;
	Mascota[] mascota;
	Veterinario[] Veterinario;

	/**
	*Esta clase define Contructor  correspondientes
	* @author Jhon H Ria�o
	*/
	public Veterinaria(int cantdue�os)
	{
		due�o=new Due�o[cantdue�os];

	}
	/**
	*Esta clase define Contructor  correspondientes
	* @author Jhon H Ria�o
	*/
	public Veterinaria(Mascota[] mascota) {
		this.mascota = mascota;
	}

	public Veterinaria(Veterinario[] doctor) {
		this.Veterinario = doctor;
	}

	/**
	*Esta clase define Creacion Due�o  correspondientes
	* @author Jhon H Ria�o
	*/
	
	public void Creardue�o(Due�o c)
	{
		for(int i=0;i<due�o.length;i++) {
			if(due�o[i]==null) {
				due�o[i]=c;
			}
		}
	}
	/**
	*Esta clase define Crear mascota  correspondientes
	* @author Jhon H Ria�o
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

}


