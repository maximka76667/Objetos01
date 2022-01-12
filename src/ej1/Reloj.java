package ej1;

public class Reloj {
	
	String marcaReloj, modeloReloj;
	double precioReloj;
	int stockReloj;
	boolean esDigitalReloj;
	
	public Reloj(String marca, String modelo, double precio, int stock, boolean esDigital) {
		marcaReloj = marca;
		modeloReloj = modelo;
		precioReloj = precio;
		stockReloj = stock;
		esDigitalReloj = esDigital;
	}
	
}
