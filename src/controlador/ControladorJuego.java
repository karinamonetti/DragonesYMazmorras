package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import modelo.Criatura;
import modelo.Heroe;
import modelo.MazmorraPrincipal;

public class ControladorJuego implements InterfazControladorJuego {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Heroe> defensores = new ArrayList<Heroe>();
	private ArrayList<Criatura> enemigos = new ArrayList<Criatura>();
	MazmorraPrincipal mazmorra1 = new MazmorraPrincipal("Jalatós", 2, enemigos, defensores);
	private GestorArchivo ficheros = new GestorArchivo();

	public ControladorJuego() {
		// Heroes
		defensores.add(new Heroe("Arthur", 10, 100, 80, "Guerrero", 2000));
		defensores.add(new Heroe("Merlin", 12, 80, 60, "Mago", 2500));
		defensores.add(new Heroe("Lancelot", 11, 90, 85, "Caballero", 2200));
		defensores.add(new Heroe("Guinevere", 9, 85, 70, "Arquera", 1800));
		defensores.add(new Heroe("Gawain", 8, 95, 75, "Paladín", 1700));

		// Criaturas
		enemigos.add(new Criatura("Dragon", 15, 150, 100, "Reptil", 3000));
		enemigos.add(new Criatura("Troll", 10, 120, 90, "Gigante", 2000));
		enemigos.add(new Criatura("Orco", 8, 100, 75, "Humanoide", 1500));
		enemigos.add(new Criatura("Harpía", 9, 85, 65, "Ave", 1600));
		enemigos.add(new Criatura("Golem", 12, 130, 95, "Constructo", 2500));
	}

	@Override
	public void menu() throws IOException {
	    int opcion;
	        System.out.println("Bienvenido al juego de Dragones y Mazmorras. \nIngresa una opción:");
	        System.out.println("1. Añadir Heroes");
	        System.out.println("2. Ver Heroes y Criaturas de una Mazmorra");
	        System.out.println("3. Simular pelea entre dos Personajes");
	        System.out.println("4. Guardar partida en un fichero");
	        System.out.println("0. Salir del juego");

	        try {
	        	opcion = sc.nextInt();
		        sc.nextLine(); 

		        while(opcion != 0) {
					
					if(opcion == 1) {
						añadirHeroe();
					} else if (opcion == 2) {
						mostrarHeroesYEnemigos();
						sc.nextLine();
					} else if (opcion == 3) {
						
						simularPelea();
						sc.nextLine();
					} else if (opcion == 4) {
						ficheros.guardarPartida(mazmorra1);
						System.out.println("Se ha guardado correctamente el fichero. Volviendo al Menú Principal...");
						menu();
						sc.nextLine();
						
					} else {
						System.err.println("ERROR: Ingresa una opción correcta.");
						menu();
						sc.nextLine();
					}
					
		        }
		       
		        System.out.println("Saliendo...");
		        
	        } catch (InputMismatchException e) {
	        	  System.err.println("ERROR: Debes ingresar un valor numérico.");
	        	  sc.nextLine();
	        	  menu();
	        	 
	        }
	        
	        
	    }

	/**
	 * [METODO] - añadirHeroe() Pide valores por consola, los valida y gestiona
	 * excepciones de entrada de datos. Agrega un nuevo heroe al ArrayList
	 * defensores con los datos ingresados.
	 * 
	 * @throws IOException
	 */
	@Override
	public void añadirHeroe() throws IOException {

		System.out.println("Opción 1 ~ Añadir héroe");

		// Nombre
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();

		// Nivel
		System.out.println("Nivel. Debe ser mayor que 0:");
		int nivel = 1;
		try {
			nivel = sc.nextInt();
			sc.nextLine();
			if (nivel < 1) {
				System.err.println("ERROR: El nivel debe ser un número positivo.");
				añadirHeroe();
			}
		} catch (InputMismatchException e) {
			System.err.println("ERROR: Debes ingresar un valor numérico.");
			añadirHeroe();
		}

		// Salud
		System.out.println("Ingresa la salud. Debe estar comprendida entre 1 y 100");
		int salud = 1;
		try {
			salud = sc.nextInt();
			sc.nextLine();
			if (salud < 1 || salud > 100) {
				System.err.println("ERROR: La salud debe estar comprendida entre 1 y 100.");
				añadirHeroe();
			}
		} catch (InputMismatchException e) {
			System.err.println("ERROR: Debes ingresar un valor numérico.");
			añadirHeroe();
		}

		// Fuerza
		System.out.println("Ingresa la fuerza. Debe estar comprendida entre 1 y 100");
		int fuerza = 1;
		try {
			fuerza = sc.nextInt();
			sc.nextLine();
			if (fuerza < 1 || fuerza > 100) {
				System.err.println("ERROR: La fuerza debe estar comprendida entre 1 y 100.");
				añadirHeroe();
			}

		} catch (InputMismatchException e) {
			System.err.println("ERROR: Debes ingresar un valor numérico.");
			añadirHeroe();
		}

		// Tipo de Clase
		System.out.println("¿Cuál es su clase? Ej.: Guerrero, Mago, etc.");
		String tipoClase = sc.nextLine();

		// Experiencia
		System.out.println("Experiencia. Debe ser mayor que 0");
		int experiencia = 1;
		try {
			experiencia = sc.nextInt();
			sc.nextLine();
			if (experiencia < 1) {
				System.err.println("ERROR: La experiencia debe ser un número positivo.");
				añadirHeroe();
			}
		} catch (InputMismatchException e) {
			System.err.println("ERROR: Debes ingresar un valor numérico.");
			añadirHeroe();
		}

		// Agregar nuevo Heroe al ArrayList defensores
		defensores.add(new Heroe(nombre, nivel, salud, fuerza, tipoClase, experiencia));
		System.out.println("Se ha añadido exitosamente un nuevo Heroe.");
		menu();

	}

	/**
	 * [METODO] - mostrarHeroesYEnemigos()
	 * 
	 * @throws IOException
	 * 
	 */
	@Override
	public void mostrarHeroesYEnemigos() throws IOException {
		System.out.println("Opción 2 ~ Mostrar Heroes y enemigos de una mazmorra.");
		for (int i = 0; i < mazmorra1.getDefensores().size(); i++) {
			System.out.println(mazmorra1.getDefensores().get(i));
		}
		for (int i = 0; i < mazmorra1.getEnemigos().size(); i++) {
			System.out.println(mazmorra1.getEnemigos().get(i));
		}
		menu();
	}

	/**
	 * [METODO] - simularPelea() Genera una pelea, no pide datos.
	 * @throws IOException 
	 */
	@Override
	public void simularPelea() throws IOException {
		System.out.println("Opción 3 ~ Simular pelea");
		defensores.get(2).pelear(enemigos.get(4));
		menu();

	}
}
