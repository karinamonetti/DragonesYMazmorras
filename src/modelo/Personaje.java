package modelo;

public abstract class Personaje {

	private String nombre;
	private int nivel;
	private int salud;
	private int fuerza;
	
	public Personaje() {
		
	}

	public Personaje(String nombre, int nivel, int salud, int fuerza) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.salud = salud;
		this.fuerza = fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", salud=" + salud + ", fuerza=" + fuerza + "]";
	}
	
	
	public abstract void metodoAbstracto();
	
	public void pelear(Personaje p) {
		if(this.getFuerza() > p.getFuerza()) {
			System.out.println("El personaje "+this.getNombre()+" gana la pelea.");
		} else if (this.getFuerza() == p.getFuerza()){
			System.out.println("La batalla será eterna porque ambos tienen la misma fuerza, el que se canse primero pues..");
		} else {
			System.out.println("El personaje "+p.getNombre()+" gana la pelea.");
		}
	}
	
	
}
