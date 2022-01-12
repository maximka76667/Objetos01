package ej5;

public class Main {

	public static void main(String[] args) {
		
		NotasAlumno notasAlumno = new NotasAlumno("Lenguajes de marca", "Andrés", "Vieites Rodriguez", 6, 7.5, 8.6);
		
		System.out.println("Asignatura: " + notasAlumno.asignatura);
		System.out.println("Nombre: " + notasAlumno.nombre);
		System.out.println("Apellido: " + notasAlumno.apellido);
		for(int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notasAlumno.getNotas()[i]);
		}
		System.out.println("Nota media: " + notasAlumno.calcularMedia());
	}

}
