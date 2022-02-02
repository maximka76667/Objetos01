package ej4_empleado;

public class Empleado {

	String dni, nombre, apellido;
	double salario, salarioNeto;

	public Empleado(String dni) {
		this(dni, "Nombre Empleado");
	}

	public Empleado(String dni, String nombre) {
		this(dni, nombre, "Apellido Empleado", 0);
	}

	public Empleado(String dni, String nombre, String apellido, double salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.salarioNeto = salario * 0.88;
	}

	public double calcularSalarioNeto() {
		return this.salarioNeto;
	}

}
