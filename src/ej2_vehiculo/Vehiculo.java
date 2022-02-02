package ej2_vehiculo;

public class Vehiculo {

	String marca, modelo, color;
	int numeroRuedas;
	float precio;

	public Vehiculo(String marca, String modelo, String color, int numRuedas, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numeroRuedas = numRuedas;
		this.precio = precio;
	}

	public float calcularIVA() {
		return this.precio * 1.21f;
	}

}
