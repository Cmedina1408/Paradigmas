package Project_Vete;

import java.util.ArrayList;
import java.util.List;

public class Tratamiento {
 
	private List<String> Tratamiento = new ArrayList<String>();
	
	public Tratamiento() {	
	}
	public void crear_tratamiento(String destratamiento) {
		Tratamiento.add(destratamiento);
	}
	public void mostrar_tratamientos () {
		System.out.println(Tratamiento.toString());
	}
	
}
