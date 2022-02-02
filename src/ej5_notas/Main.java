package ej5_notas;

public class Main {

	public static void main(String[] args) {

		float[] notas = { 6, 7.5f, 8.6f };
		NotasAlumno notasAlumno = new NotasAlumno("Lenguajes de marca", "Andrés", "Vieites Rodriguez", notas);

		System.out.println("Asignatura: " + notasAlumno.getAsignatura());
		System.out.println("Nombre: " + notasAlumno.getNombre());
		System.out.println("Apellido: " + notasAlumno.getApellido());
		for (int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notasAlumno.getNotas()[i]);
		}
		System.out.println("Nota media: " + notasAlumno.calcularMedia());
	}

}
