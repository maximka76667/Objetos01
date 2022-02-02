package ej1_reloj;

public class Main {

	public static void main(String[] args) {
		
		Reloj reloj1 = new Reloj("Casio", "X-300", 100, 10, true);
		Reloj reloj2 = new Reloj("Rolex", "J-5000", 400, 5, false);

		System.out.println(reloj1.getPrecio() + reloj2.getPrecio());

	}

}
