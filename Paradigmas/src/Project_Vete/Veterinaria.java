package Project_Vete;

public class Veterinaria {

	/**
	*Esta clase define  Definicion de arreglos  correspondientes
	* @author Jhon H Ria�o
	*/

	Due�o[] due�o;
	Mascota[] mascota;
	Doctor[] doctor;

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

	public Veterinaria(Doctor[] doctor) {
		this.doctor = doctor;
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
	/**
	*Esta clase define Crear Veterinario  correspondientes
	* @author Jhon H Ria�o
	*/
	
	public void Crearveterinario(Doctor v)
	{
		for(int i=0;i<doctor.length;i++) {
			if(doctor[i]==null) {
				doctor[i]=v;
			}
		}
	}

}


