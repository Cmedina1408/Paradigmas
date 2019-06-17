package Project_Vete;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * Esta clase me permite generar una consulta para el animal
 * @author Paradigmas
 */


public class consulta_Medica {

	private int id_consulta = 0 ;
	public Date Fecha_Actual= new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public String Motivo = "";
	public String Examen_fisico = "";
	public String Tratamiento = "";


	consulta_Medica(int id_consulta , String Motivo , String
			Examen_fisico , String Tratmiento)
	{

		this.id_consulta = id_consulta;
		this.Motivo = Motivo;
		this.Examen_fisico = Examen_fisico;
		this.Tratamiento = Tratmiento;

	}
	/*
	 *@author Damanchola
	 *Permite obtener los datos el motivo de la consulta   
	 */
	public String Obtener_Motivo() 
	{
		return "El motivo de esta consulta fue : " + Motivo;
	}
	public void Modificar_Motivo(String Modificar) 
	{
		Motivo = Modificar;
	}
	public String Obtener_Examen_Fisico ()
	{
		return "El examen fisico es : " + Examen_fisico;
	}

	public void Modificar_Examen_Fisico(String Modificar) 
	{
		Examen_fisico = Modificar;
	}
	public String Obtener_Tratamiento () 
	{
		return "El tratamiento del animal es " +  Tratamiento;
	}
	public void Modificar_Tratamiento (String Modificar) {
		Tratamiento = Modificar;
	}

	public String toString() {
		return "id : " + id_consulta + " fecha : " + sdf.format(Fecha_Actual) + "\n" +
				"El motivo fue : " + Motivo + "\nEl examen fisico es : " + Examen_fisico +
				"\nEl tratamiento es : " + Tratamiento ; 
	}

	public static void main(String[] args) {
		consulta_Medica Animal1 = new consulta_Medica(0, "enfermedad", "a", "c");
		
		System.out.println(Animal1.toString());
		
	}
	
	
}
