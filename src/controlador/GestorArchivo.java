package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import modelo.MazmorraPrincipal;

public class GestorArchivo {

	
	public GestorArchivo() {
		
	}
	
	/**
	 * [METODO]- escribirFichero()
	 * @param mazmorraPrincipal -> Recibe
	 * @throws IOException 
	 */
	public void guardarPartida(MazmorraPrincipal mazmorraPrincipal) throws IOException {
	
			BufferedWriter escribirFichero = new BufferedWriter(new FileWriter("fichero/mazmorra.txt"));

			escribirFichero.write("Nombre de la Mazmorra: " + mazmorraPrincipal.getNombre());
			escribirFichero.newLine();
			escribirFichero.write("Nivel: " + mazmorraPrincipal.getNivelDificultad());
			escribirFichero.newLine();
			escribirFichero.write("*********************************************");
			escribirFichero.newLine();

			for (int i = 0; i < mazmorraPrincipal.getDefensores().size(); i++) {
				escribirFichero.write(mazmorraPrincipal.getDefensores().get(i).toString());
				escribirFichero.newLine();
				escribirFichero.write("******************");
				escribirFichero.newLine();
			}
			for (int i = 0; i < mazmorraPrincipal.getEnemigos().size(); i++) {
				escribirFichero.write(mazmorraPrincipal.getEnemigos().get(i).toString());
				escribirFichero.newLine();
				escribirFichero.write("******************");
				escribirFichero.newLine();
			}

			escribirFichero.close();

		
		
	}
}
