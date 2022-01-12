package ej3;

public class Rectangulo {

	double baseRectangulo, alturaRectangulo;
	
	public Rectangulo(double base, double altura) {
		baseRectangulo = base;
		alturaRectangulo = altura;
	}
	
	public double calcularPerimetro() {
		return (baseRectangulo + alturaRectangulo) * 2;
	}
	
	public double calcularArea() {
		return baseRectangulo * alturaRectangulo;
	}
}
