package modelo;

import java.util.ArrayList;

public class MazmorraPrincipal extends Mazmorra{

	private ArrayList<Heroe> defensores = new ArrayList<Heroe>();
	
	public MazmorraPrincipal() {
		
	}
	
	
	public MazmorraPrincipal(String nombre, int nivelDificultad, ArrayList<Criatura> enemigos,
			ArrayList<Heroe> defensores) {
		super(nombre, nivelDificultad, enemigos);
		this.defensores = defensores;
	}


	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		
	}


	public ArrayList<Heroe> getDefensores() {
		return defensores;
	}


	public void setDefensores(ArrayList<Heroe> defensores) {
		this.defensores = defensores;
	}


	@Override
	public String toString() {
		return "***MAZMORRA PRINCIPAL***\nDefensores: " + defensores + "\nNombre: " + getNombre()
				+ "\nNivel de dificultad: " + getNivelDificultad() + "\nEnemigos: " + getEnemigos();
	}
	
	

}
