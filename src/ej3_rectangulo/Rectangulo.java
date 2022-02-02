package ej3_rectangulo;

public class Rectangulo {

	float base, altura;
	
	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public float calcularPerimetro() {
		return (this.base + this.altura) * 2;
	}
	
	public float calcularArea() {
		return this.base * this.altura;
	}
}
