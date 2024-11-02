package modelo;

/*
*@author Johan David Sánchez Rojas
*@Carne C17305
*@version 09-25-2024
*/
public class Curso {
	private String nombre;
	private String codigo;
	private Estudiante[] estudiantes;
	
	public Curso() {
		this.nombre = "";
		this.codigo = "";
		this.estudiantes = null;
	}
	
	public Curso(String nombre, String codigo, Estudiante[] estudiantes) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.estudiantes = estudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", codigo=" + codigo + ", estudiantes=" + estudiantes + "]";
	}	
}