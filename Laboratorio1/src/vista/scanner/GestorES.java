package vista.scanner;

import java.util.Scanner;

public class GestorES {
	private Scanner scanner;

	public GestorES() {
		scanner = new Scanner(System.in);
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public String solicitarString(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextLine();
	}

	public int solicitarEntero(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}

	public double solicitarDouble(String mensaje) {
		System.out.println(mensaje);
		return Double.parseDouble(scanner.nextLine());
	}

	public char solicitarChar(String mensaje) {
		System.out.println(mensaje);
		String hilera = scanner.nextLine();
		char caracter = hilera.charAt(0);
		return caracter;
	}

	@Override
	public String toString() {
		return "GestorES [scanner=" + scanner + "]";
	}
}
