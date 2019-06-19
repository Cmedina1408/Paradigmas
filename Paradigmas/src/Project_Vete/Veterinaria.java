package Project_Vete;

public class Veterinaria {

	// Definicion de arreglos @Jhon Riaño
	Dueño[] dueño;
	Mascota[] mascota;
	Veterinario[] Veterinario;

	//Constructor @Jhon Riaño
	public Veterinaria(int cantdueños)
	{
		dueño=new Dueño[cantdueños];

	}
	//Constructor@Jhon Riaño
	public Veterinaria(Mascota[] mascota) {
		this.mascota = mascota;
	}

	public Veterinaria(Veterinario[] doctor) {
		this.Veterinario = doctor;
	}

	//Creacion Dueño @Jhon Riaño
	public void Creardueño(Dueño c)
	{
		for(int i=0;i<dueño.length;i++) {
			if(dueño[i]==null) {
				dueño[i]=c;
			}
		}
	}
	//Crear mascota @Jhon Riaño
	public void Crearmascota(Mascota m)
	{
		for(int i=0;i<mascota.length;i++) {
			if(mascota[i]==null) {
				mascota[i]=m;
			}
		}
	}
	//Crear Veterinario @Jhon Riaño
	public void Crearveterinario(Veterinario v)
	{
		for(int i=0;i<Veterinario.length;i++) {
			if(Veterinario[i]==null) {
				Veterinario[i]=v;
			}
		}
	}

}


