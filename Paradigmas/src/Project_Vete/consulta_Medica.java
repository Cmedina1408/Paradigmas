package Project_Vete;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * Esta clase me permite generar una consulta para el animal
<<<<<<< HEAD
 * @author Daniel Manchola
=======
 * @author Jhon H Riaño
>>>>>>> branch 'master' of https://github.com/damanchola1/Paradigmas.git
 */


public class consulta_Medica{
	
	public int id_consulta;
	public Date Fecha_Actual= new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public String Enfermedad = "";
	public String Motivo = "";
	public String Examen_fisico = "";
	public String Tratamiento = "";
	
	/**
	 * Permite contruir el objeto
	 * @param Motivo
	 * @param Examen_fisico
	 * @param Enfermedad
	 * @param Tratmiento
	 */
	consulta_Medica(String Motivo , String Examen_fisico , String Enfermedad , String Tratmiento )
	{
		this.Motivo = Motivo;
		this.Examen_fisico = Examen_fisico;
		this.Tratamiento = Tratmiento;
		this.Enfermedad = Enfermedad;
	}
	/**
	 * permite obtener el motivo de la consulta
	 * 
	 */
	
	public String get_Motivo() 
	{
		return "El motivo de esta consulta fue : " + Motivo;
	}
	/**
	 * permite modificar el motivo de la consulta
	 * @param Modificar
	 */
	public void set_Motivo(String Modificar) 
	{
		Motivo = Modificar;
	}
	public String get_Examen_Fisico ()
	{
		return "El examen fisico es : " + Examen_fisico;
	}
	/**
	 *Permite modificar el examen fisico
	 * @param Modificar
	 */
	public void set_Examen_Fisico(String Modificar) 
	{
		Examen_fisico = Modificar;
	}
	/**
	 * 
	 * @return
	 */
	public String get_Enfermedad () 
	{
		return "La enfermedad del animal es : " +  Enfermedad;
	}
	/**
	 * permite modificar la enfermedad
	 * @param Modificar
	 */
	public void set_Enfermedad (String Modificar) {
		Enfermedad = Modificar;
	}
	/**
	 * permite obtener el tratamiento
	 * @return
	 */
	public String get_Tratamiento () 
	{
		return "El tratamiento del animal es " +  Tratamiento;
	}
	/**
	 * permite modificar el tratamiento
	 * @param Modificar
	 */
	public void set_Tratamiento (String Modificar) {
		Tratamiento = Modificar;
	}
	
	/**
	 * imprime la informacion de la consulta
	 */
	public String toString() {
		return "id : " + id_consulta + " fecha : " + sdf.format(Fecha_Actual) + "\n" +
				"El motivo fue : " + Motivo + "\nEl examen fisico es : " + Examen_fisico + 
				"\nLa Enfermedad es : " + Enfermedad + "\nEl tratamiento es : " + Tratamiento ; 
	}	
}
