package ej2;

public class Vehiculo {

	String marcaVehiculo, modeloVehiculo, colorVehiculo;
	int numeroRuedasVehiculo; 
	double precioVehiculo;
	
	public Vehiculo(String marca, String modelo, String color, int numRuedas, double precio) {
		marcaVehiculo = marca; 
		modeloVehiculo = modelo; 
		colorVehiculo = color;
		numeroRuedasVehiculo = numRuedas;
		precioVehiculo = precio;
	}
	
	public float calcularPrecioIVA() {
		return (float)(precioVehiculo * 1.21);
	}
	
}
