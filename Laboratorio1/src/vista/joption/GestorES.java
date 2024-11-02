package vista.joption;

/*
*@author Denis GH
*@version 08-28-2024
*/
import javax.swing.JOptionPane;

public class GestorES {
	//SIN Atributos 
	
	//Metodo Constructor sin parametros y vacio ()
	public GestorES() {
		
	}
	
	//SIN gets, ni sets  

    //otros metodos
	public void mostrarMensaje (String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String solicitarString(String mensaje){
		return JOptionPane.showInputDialog(mensaje);
	}

	public int solicitarEntero(String mensaje){
		int numeroSolicitado = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return numeroSolicitado;
	}

	public double solicitarDouble(String mensaje){
		double numeroSolicitado = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return numeroSolicitado;
	}

    public char solicitarChar(String mensaje) {
        String hilera = JOptionPane.showInputDialog(null, mensaje);
        char caracter = hilera.charAt(0);
        return caracter;
    }

	public String toString() {
		return "GestorES []";
	}
	
}
