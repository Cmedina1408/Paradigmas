package Project_Vete;

public class Veterinaria {

// Definicion de arreglos @Jhon Ria�o
        Due�o[] due�o;
	Mascota[] mascota;
        Doctor[] doctor;
        
	//Constructor @Jhon Ria�o
	public Veterinaria(int cantdue�os)
	{
		due�o=new Due�o[cantdue�os];
                	
	}
     //Constructor@Jhon Ria�o
    public Veterinaria(Mascota[] mascota) {
        this.mascota = mascota;
    }

    public Veterinaria(Doctor[] doctor) {
        this.doctor = doctor;
    }
 
	//Creacion Due�o @Jhon Ria�o
	public void Creardue�o(Due�o c)
	{
		for(int i=0;i<due�o.length;i++) {
			if(due�o[i]==null) {
				due�o[i]=c;
			}
		}
	}
	//Crear mascota @Jhon Ria�o
	public void Crearmascota(Mascota m)
	{
		for(int i=0;i<mascota.length;i++) {
			if(mascota[i]==null) {
				mascota[i]=m;
			}
		}
	}
        //Crear Veterinario @Jhon Ria�o
        public void Crearveterinario(Doctor v)
        {
            for(int i=0;i<doctor.length;i++) {
			if(doctor[i]==null) {
				doctor[i]=v;
			}
            }
        }
        
}