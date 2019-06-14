package Project_Vete;

import java.util.*;
/**
 * Esta clase valida las enfermedades más comunes de los animales registrando
 * las detectadas por el veterinario y valida su criticidad
 * @author WILSON GUTIERREZ LANCHEROS
 * @version 2019/06
 *
 */
public class Enfermedad {
	
	//Variables de la clase
	private static String nombreEnfermedad;
	private static boolean cronica = false;	
	private static List<String> listEnfAnim = new ArrayList<String>();
	private static List<Integer> listRegAnim = new ArrayList<Integer>();
	
	/**
	 * Constructor para listar las enfermedades dependiendo de la especie de animal.
	 * @param especie es evaluada para obtener la lista de enfermedades.
	 */		
	Enfermedad(String especie) {
		listaEnfermedad(especie);
	} 
	
	/**
	 * El metodo listaEnfermedad evalua que enfermedades mostrar.
	 * @param especieAnml entrega la especie. 
	 */
	private static void listaEnfermedad(String especieAnml) {
		List<String> listEnf = new ArrayList<String>();
		if (especieAnml == "PERRO" ) {			
			listEnf.add("Alergia");
			listEnf.add("Artrosis");
			listEnf.add("Rabia");
			listEnf.add("Sobrepeso");
			listEnf.add("Gastroenteritis");
			}
		
		if (especieAnml == "GATO" ) {			
			listEnf.add("Pancreatitis");
			listEnf.add("Leucemia");
			listEnf.add("Rabia");
			listEnf.add("Pancreatitis");
			listEnf.add("Gastroenteritis");
			}
			
		if (especieAnml == "CABALLO" ) {			
			listEnf.add("Nematodos");
			listEnf.add("Tenias");
			listEnf.add("Anemia");
			listEnf.add("Influenza");			
			}
		
		if (especieAnml == "CONEJO" ) {			
			listEnf.add("Moquillo");
			listEnf.add("Neumonía");
			listEnf.add("Sarna");
			listEnf.add("Mixomatosis");	//Virus transmitido por picadura de insecto		
			}
		
		//Revisa la lista para mostrar en pantalla los resultados de las enfermedades.
	    Iterator<String> i = listEnf.iterator();
        while(i.hasNext())
       {
           System.out.println(i.next());
       }
		
	}
	
/**
 * Asigna el valor para nombreEnfermedad 
 * @param n contiene el nombre de la enfermedad que se quiere registrar
 * */
	private static void setEnfermedad (String n) {			
		nombreEnfermedad = n;		
	}
	
	/**
	 * @return nombreEnfermedad entrega el nombre de la enfermedad 	 * 
	 */
	private static String getEnfermedad () {
		return nombreEnfermedad;
	}

/**  
 * El método se encarga de realizar el proceso de registrar la mascota y su enfermedad.
 * @param numReg es el numero del registro de la mascota de la clase Animal
 * @param nmEnfmdd contiene el nombre de la enfermedad. 
 */	
	public static void recibirEnfermedad (int numReg, String nmEnfmdd) {		
		setEnfermedad(nmEnfmdd);
		getEnfermedad();		
		listEnfAnim.add(nombreEnfermedad);
		listRegAnim.add(numReg);		
	}
	
	/**
	 * @param numReg se usa para buscar a determinado animal que se encuentre registrado.
	 * */
	public static void buscarAnimEnf (int numReg) {
		   int j = 0;
		   
		   int tam = listRegAnim.size();
		   for (int i = 0; i <= tam - 1; i++) {
				if (listRegAnim.get(i)==numReg )
	            {System.out.println(listRegAnim.get(i));	            
	             j = i;
	             i = tam;
	            }
				else if (tam == i)
						;
	        }
		   
		    for (int i = 0; i <= j; i++) {
				if (i == j )
					{
					System.out.println("Enfermedad registrada: " + listEnfAnim.get(j));					 
					}
	        }		
		
	}

	/**
	 * @param numReg se usa para buscar a determinado animal que se encuentre 
	 * registrado y eliminarlo 
	 * */
	public static void eliminarAnimEnf (int numReg) {
		   int j = listRegAnim.size() - 1;
		   
		   for (int i = 0; i <= j; i++) {
				if (listRegAnim.get(i)==numReg )
	            {System.out.println("Se va a eliminar: "+listRegAnim.get(i));
	            listRegAnim.remove(i);
	             j = i;
	            }
				;
	        }
		   
		   for (int i = 0; i <= j; i++) {
				if (i == j )
	            {System.out.println(listEnfAnim.get(j));         
				listEnfAnim.remove(j);}
				;
	        }		
		
	}
	
	/**
	 * @param numReg se usa para buscar a determinado animal que se encuentre 
	 * registrado y actualizarlo .
	 * @param nuevo contiene el nombre de la enfermedad para corregir.
	 * */
	public void actualizarAnimEnf (int numReg, String nuevo) {
		 int j = 0;
		   
		   for (int i = 0; i <= listRegAnim.size() - 1; i++) {
				if (listRegAnim.get(i)==numReg )
	            {System.out.println(listRegAnim.get(i));
	             j = i;
	            }
				;
	        }
		   
		   for (int i = 0; i <= j; i++) {
				if (i==j )
	            {System.out.println("Se va a actualizar: "+listEnfAnim.get(j));
	            listEnfAnim.set(j, nuevo);	            
	            }
				;
	        }
		   
	}
		
	/**
	 * @param validar contiene el nombre de la enfermedad que requiere ser evaluada 
	 * su criticidad.
	 * @return entrega la criticidad de la enfermedad indicando si es cronica o no
	 * */
	public boolean urgencia(String validar) {
		if (validar == "Alergia")
			cronica = false;
		if (validar == "Artrosis")
			cronica = true;
		if (validar == "Rabia")
			cronica = true;
		if (validar == "Sobrepeso")
			cronica = false;
		if (validar == "Gastroenteritis")
			cronica = true;
		if (validar == "Pancreatitis")
			cronica = true;
		if (validar == "Leucemia")
			cronica = true;
		if (validar == "Pancreatitis")
			cronica = true;
		if (validar == "Nematodos")
			cronica = false;
		if (validar == "Tenias")
			cronica = false;
		if (validar == "Anemia")
			cronica = true;
		if (validar == "Influenza")
			cronica = true;
		if (validar == "Moquillo")
			cronica = false;
		if (validar == "Neumonía")
			cronica = true;
		if (validar == "Sarna")
			cronica = true;
		if (validar == "Mixomatosis")
			cronica = true;
		
			return cronica;
		
		}

}
