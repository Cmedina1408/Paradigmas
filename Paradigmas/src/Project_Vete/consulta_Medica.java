package Project_Vete;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * Esta clase me permite generar una consulta para el animal
 * @author Paradigmas
 */


public class consulta_Medica{
	
	public int id_consulta [];
	public Date Fecha_Actual= new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public String Enfermedad = "";
	public String Motivo = "";
	public String Examen_fisico = "";
	public String Tratamiento = "";
	
	

	consulta_Medica(String Motivo , String Examen_fisico , String Enfermedad , String Tratmiento )
	{
		this.Motivo = Motivo;
		this.Examen_fisico = Examen_fisico;
		this.Tratamiento = Tratmiento;
		this.Enfermedad = Enfermedad;
	}
	
	public int Aumentar_id(int id) {
		
		for (int i = 0; i < this.id_consulta.length; i++) {
			if(id_consulta[i] == 0) {
				id_consulta[i]= id;
				break;
			}
		}
		return id;
	}
	
	public String get_Motivo() 
	{
		return "El motivo de esta consulta fue : " + Motivo;
	}
	public void set_Motivo(String Modificar) 
	{
		Motivo = Modificar;
	}
	public String get_Examen_Fisico ()
	{
		return "El examen fisico es : " + Examen_fisico;
	}

	public void set_Examen_Fisico(String Modificar) 
	{
		Examen_fisico = Modificar;
	}
	
	public String get_Enfermedad () 
	{
		return "La enfermedad del animal es : " +  Enfermedad;
	}
	public void set_Enfermedad (String Modificar) {
		Enfermedad = Modificar;
	}
	public String get_Tratamiento () 
	{
		return "El tratamiento del animal es " +  Tratamiento;
	}
	public void set_Tratamiento (String Modificar) {
		Tratamiento = Modificar;
	}

	public String toString() {
		return "id : " + id_consulta + " fecha : " + sdf.format(Fecha_Actual) + "\n" +
				"El motivo fue : " + Motivo + "\nEl examen fisico es : " + Examen_fisico + 
				"\nLa Enfermedad es : " + Enfermedad + "\nEl tratamiento es : " + Tratamiento ; 
	}	
}
