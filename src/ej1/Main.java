package ej1;

public class Main {

	public static void main(String[] args) {
		
		Reloj reloj1 = new Reloj("Casio", "X-300", 100.5, 10, true);
		Reloj reloj2 = new Reloj("Rolex", "J-5000", 400, 5, false);

		System.out.println(reloj1.precioReloj + reloj2.precioReloj);

	}

}
