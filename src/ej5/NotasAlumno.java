package ej5;

public class NotasAlumno {
	String asignatura, nombre, apellido;
	double[] notas = new double[3];
	
	public NotasAlumno(String asignaturaAlumno, String nombreAlumno, String apellidoAlumno, double notaAlumnoEval1, double notaAlumnoEval2, double notaAlumnoEval3) {
		asignatura = asignaturaAlumno; 
		nombre = nombreAlumno; 
		apellido = apellidoAlumno;
		notas[0] = notaAlumnoEval1;
		notas[1] = notaAlumnoEval2;
		notas[2] = notaAlumnoEval3;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double notaAlumnoEval1, double notaAlumnoEval2, double notaAlumnoEval3) {
		notas[0] = notaAlumnoEval1;
		notas[1] = notaAlumnoEval2;
		notas[2] = notaAlumnoEval3;
	}
	
	public double calcularMedia() {
		double suma = 0;
		for(int i = 0; i < 3; i++) suma += notas[i];
		return suma / 3;
	}
}
