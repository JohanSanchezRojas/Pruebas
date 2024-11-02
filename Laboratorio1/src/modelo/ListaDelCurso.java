package modelo;

/*
*@author Johan David Sánchez Rojas
*@Carne C17305
*@version 09-25-2024
*/
public class ListaDelCurso {
	private Estudiante[] estudiantes;
	private String nombre;
	private String codigo;

	public ListaDelCurso() {
		this.estudiantes = null;
		this.nombre = "";
		this.codigo = "";
	}

	public ListaDelCurso(Estudiante[] estudiantes, String nombre, String codigo) {
		this.estudiantes = estudiantes;
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public ListaDelCurso(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public ListaDelCurso(int cantidad) {
		estudiantes = new Estudiante[cantidad];
	}

	public ListaDelCurso(String nombre, String codigo, int cantidad) {
		this(cantidad);
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
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

	public void ordenar() {
		for (int i = 0; i < estudiantes.length; i++) {
			for (int j = i; j < estudiantes.length; j++) {
				if (estudiantes[i] != null && estudiantes[j] != null) {
					if (estudiantes[i].getNumMatricula() < estudiantes[j].getNumMatricula()) {
						Estudiante auxiliar = estudiantes[i];
						estudiantes[i] = estudiantes[j];
						estudiantes[j] = auxiliar;
					}
				}
			}
		}
	}

	public void matricular(Estudiante estudiante) {
		if (estudiantes[estudiantes.length - 1] == null) {
			for (int i = estudiantes.length - 2; i < 0; i--) {
				estudiantes[i] = estudiantes[i + 1];
			}

			estudiantes[0] = estudiante;
		}
	}

	public String listarCurso() {
		int cantidadEstudiantes = 0;
		String nombresEstudiantes = "";

		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i] != null) {
				nombresEstudiantes += estudiantes[i].getNombre() + "\n";
				cantidadEstudiantes++;
			}
		}

		return nombre + ": \n" + "Numero de estudiantes: " + cantidadEstudiantes + "\n" + "Nombres de los estudiantes: "
				+ "\n" + nombresEstudiantes;
	}

	public Estudiante buscar(int numMatricula) {
		Estudiante estudiante = null;
		int inicio = 0;
		int fin = estudiantes.length - 1;
		int medio;

		while (inicio <= fin) {
			medio = (inicio + fin) / 2;

			if (estudiantes[medio].getNumMatricula() == numMatricula) {
				estudiante = estudiantes[medio];
			} else if (estudiantes[medio].getNumMatricula() < numMatricula) {
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}

		return estudiante;
	}
}