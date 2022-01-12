package ej4;

public class Main {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("12789671W", "Pepe", "Rodriguez", 1200);
		
		System.out.println("Salario Neto: " + empleado.volverSalarioNeto());
	}

}
