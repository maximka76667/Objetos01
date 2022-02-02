package ej3_rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo rect = new Rectangulo(7.5f, 4.6f);
		
		System.out.println("Perimetro: " + rect.calcularPerimetro());
		System.out.println("Area: " + rect.calcularArea());
		
	}

}
