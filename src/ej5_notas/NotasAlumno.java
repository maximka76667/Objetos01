package ej5_notas;

public class NotasAlumno {
	private String asignatura, nombre, apellido;
	private float[] notas = new float[3];

	public NotasAlumno(String asignatura, String nombre, String apellido, float[] notas) {
		this.asignatura = asignatura;
		this.nombre = nombre;
		this.apellido = apellido;
		setNotas(notas);
	}

	public String getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNota1(float nota1) {
		if(nota1 > 10 || nota1 < 0) System.out.println("Nota erróneo");
		else this.notas[0] = nota1;
	}

	public float getNota1() {
		return this.notas[0];
	}

	public void setNota2(float nota2) {
		if(nota2 > 10 || nota2 < 0) System.out.println("Nota erróneo");
		else this.notas[1] = nota2;
	}

	public float getNota2() {
		return this.notas[1];
	}

	public void setNota3(float nota3) {
		if(nota3 > 10 || nota3 < 0) System.out.println("Nota erróneo");
		else this.notas[2] = nota3;
	}

	public float getNota3() {
		return this.notas[2];
	}

	public float[] getNotas() {
		return this.notas;
	}

	public void setNotas(float[] nuevasNotas) {
		for(int i = 0; i < 3; i++) {
			if(nuevasNotas[i] > 10 || nuevasNotas[i] < 0) {
				System.out.println("Nota erróneo");
				continue;
			}
			this.notas[i] = nuevasNotas[i];
		}
	}

	public double calcularMedia() {
		double suma = 0;
		for (int i = 0; i < 3; i++)
			suma += this.notas[i];
		return suma / 3;
	}
}
