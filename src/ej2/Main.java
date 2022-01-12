package ej2;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo seat = new Vehiculo("Seat", "Ibiza", "Rojo", 4, 11500);
		Vehiculo yamaha = new Vehiculo("Yamaha", "MT-03", "Negro", 2, 6000);
	
		System.out.println("Seat precio con IVA: " + seat.calcularPrecioIVA());
		System.out.println("Yamaha precio con IVA: " + yamaha.calcularPrecioIVA());
		
	}

}
