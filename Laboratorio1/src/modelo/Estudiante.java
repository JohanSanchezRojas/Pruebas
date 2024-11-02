package modelo;

/*
*@author Johan David Sánchez Rojas
*@Carne C17305
*@version 09-25-2024
*/
public class Estudiante {
	private int numMatricula;
	private String nombre;
	private String carrera;
	
	public Estudiante() {
		this.numMatricula = 0;
		this.nombre = "";
		this.carrera = "";
	}
	
	public Estudiante(int numMatricula, String nombre, String carrera) {		
		this.numMatricula = numMatricula;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Estudiante [numMatricula=" + numMatricula + ", nombre=" + nombre + ", carrera=" + carrera + "]";
	}		
}