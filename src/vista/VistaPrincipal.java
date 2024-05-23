package vista;

import java.io.IOException;

import controlador.ControladorJuego;
import controlador.InterfazControladorJuego;

public class VistaPrincipal {


	
	public static void main(String[] args) {
		InterfazControladorJuego cj = new ControladorJuego();
		try {
			cj.menu();
		} catch (IOException e) {
			System.err.println("ERROR: Ha ocurrido un error en la ejecución del programa. Volviendo al menú inicial...");
		}
	}

}
