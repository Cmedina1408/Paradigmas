package Project_Vete;

public class Medicamento {

	public int numero_Medicamento = 0;
	public int Dosis = 0;
	public int Numero_Dias=  0;
	public String Nombre_Medicamento = "";
	
	public Medicamento(int numero_Medicamento , int Dosis , int Numero_Dias , String Nombre_Medicamento) {
		
		this.numero_Medicamento = numero_Medicamento;
		this.Dosis = Dosis;
		this.Numero_Dias = Numero_Dias;
		this.Nombre_Medicamento = Nombre_Medicamento;
	}
	
	public int getnumero_medicamento() {
		return numero_Medicamento;
	}
	public void setnumero_medicamento(int nmedicamento) {
		numero_Medicamento=nmedicamento;
	}
	public int getDosis() {
		return Dosis;
	}
	public void setDosis(int nDosis) {
		Dosis=nDosis;
	}
	public int getnumero_Dias() {
		return Numero_Dias;
	}
	public void setnumero_Dias(int nDias) {
		 Numero_Dias = nDias;
	}
		
	public String toString() 
	{
		return "id : " + numero_Medicamento + "Dosis : " + Dosis + "Numero de dias: " + Numero_Dias +
				"Medicamento: " + Nombre_Medicamento; 
	}
	
}
