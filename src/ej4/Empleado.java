package ej4;

public class Empleado {
	
	String DNI, nombre, apellido;
	double salario, salarioNeto;
	
	public Empleado(String DNIEmpleado, String nombreEmpleado, String apellidoEmpleado, double salarioEmpleado) {
		DNI = DNIEmpleado;
		nombre = nombreEmpleado;
		apellido = apellidoEmpleado;
		salario = salarioEmpleado;
		salarioNeto = salarioEmpleado * 0.88;
	}
	
	public double volverSalarioNeto() {
		return salarioNeto;
	}

}
