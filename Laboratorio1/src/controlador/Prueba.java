package controlador;

import modelo.Curso;
import modelo.Estudiante;
import modelo.ListaDelCurso;
import vista.joption.GestorES;

/*
*@author Johan David Sánchez Rojas
*@Carne C17305
*@version 09-25-2024
*/
public class Prueba {

	public static void main(String[] args) {
		GestorES gestor = new GestorES();

		Estudiante estudiante1 = new Estudiante(1111, "Andrea", "Informatica");
		Estudiante estudiante2 = new Estudiante(2222, "Vivian", "Informatica");

		Estudiante estudiante3 = new Estudiante(3333, "Negro", "Informatica");
		Estudiante estudiante4 = new Estudiante(4444, "Asis", "Informatica");
		Estudiante estudiante5 = new Estudiante(5555, "Jira", "Informatica");

		Estudiante estudiante6 = new Estudiante(6666, "Allan", "Informatica");
		Estudiante estudiante7 = new Estudiante(7777, "Michael", "Informatica");
		Estudiante estudiante8 = new Estudiante(8888, "Josafath", "Informatica");
		Estudiante estudiante9 = new Estudiante(9999, "Jose", "Informatica");

		Estudiante[] listaEstudiantes1 = { estudiante1, estudiante2, null, null };
		Estudiante[] listaEstudiantes2 = { estudiante3, estudiante4, estudiante5, null };
		Estudiante[] listaEstudiantes3 = { estudiante7, estudiante9, estudiante8, estudiante6 };

		Curso curso1 = new Curso("Programacion", "PR01", listaEstudiantes1);
		Curso curso2 = new Curso("Algoritmos", "AL02", listaEstudiantes2);
		Curso curso3 = new Curso("Bases de datos", "BD03", listaEstudiantes3);

		ListaDelCurso listaCurso1 = new ListaDelCurso(curso1.getEstudiantes(), curso1.getNombre(), curso1.getCodigo());
		ListaDelCurso listaCurso2 = new ListaDelCurso(curso2.getEstudiantes(), curso2.getNombre(), curso2.getCodigo());
		ListaDelCurso listaCurso3 = new ListaDelCurso(curso3.getEstudiantes(), curso3.getNombre(), curso3.getCodigo());

		// Crear estudiante
		int numMatricula = gestor.solicitarEntero("Ingrese el numero de matricula");
		String nombre = gestor.solicitarString("Ingrese el nombre");

		Estudiante estudiantePrueba = new Estudiante(numMatricula, nombre, "Informatica");

		// Lista1
		listaCurso1.matricular(estudiantePrueba);

		gestor.mostrarMensaje(listaCurso1.listarCurso());

		listaCurso1.ordenar();

		gestor.mostrarMensaje(listaCurso1.listarCurso());

		// Lista3
		gestor.mostrarMensaje(listaCurso3.listarCurso());

		listaCurso3.ordenar();

		gestor.mostrarMensaje(listaCurso3.listarCurso());
	}
}