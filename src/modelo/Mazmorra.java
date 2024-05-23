package modelo;

import java.util.ArrayList;

public abstract class Mazmorra {
	
	private String nombre;
	private int nivelDificultad;
	private ArrayList<Criatura> enemigos = new ArrayList<Criatura>();
	
	public Mazmorra() {
		
	}

	public Mazmorra(String nombre, int nivelDificultad, ArrayList<Criatura> enemigos) {
		this.nombre = nombre;
		this.nivelDificultad = nivelDificultad;
		this.enemigos = enemigos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public ArrayList<Criatura> getEnemigos() {
		return enemigos;
	}

	public void setEnemigos(ArrayList<Criatura> enemigos) {
		this.enemigos = enemigos;
	}

	@Override
	public String toString() {
		return "Mazmorra [nombre=" + nombre + ", nivelDificultad=" + nivelDificultad + ", enemigos=" + enemigos + "]";
	}
	
	public abstract void metodoAbstracto();
	
	
}
