package controlador;

import java.io.IOException;

public interface InterfazControladorJuego {

	void menu() throws IOException;

	/**
	 * [METODO] - añadirHeroe() Pide valores por consola, los valida y gestiona
	 * excepciones de entrada de datos. Agrega un nuevo heroe al ArrayList
	 * defensores con los datos ingresados.
	 * 
	 * @throws IOException
	 */
	void añadirHeroe() throws IOException;

	/**
	 * [METODO] - mostrarHeroesYEnemigos()
	 * 
	 * @throws IOException
	 * 
	 */
	void mostrarHeroesYEnemigos() throws IOException;

	/**
	 * [METODO] - simularPelea() Genera una pelea, no pide datos.
	 * @throws IOException 
	 */
	void simularPelea() throws IOException;

}