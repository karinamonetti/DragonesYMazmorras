package modelo;

public class Heroe extends Personaje{

	private String tipoClase;
	private int experiencia;
	
	public Heroe () {
		
	}
	
	
	public Heroe(String nombre, int nivel, int salud, int fuerza, String tipoClase, int experiencia) {
		super(nombre, nivel, salud, fuerza);
		this.tipoClase = tipoClase;
		this.experiencia = experiencia;
	}



	public String getTipoClase() {
		return tipoClase;
	}


	public void setTipoClase(String tipoClase) {
		this.tipoClase = tipoClase;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "***HEROE***\nTipo: " + tipoClase + "\nExperiencia: " + experiencia + "\nNombre: " + getNombre()
				+ "\nNivel: " + getNivel() + "\nSalud: " + getSalud() + "\nFuerza: " + getFuerza();
	}

	
	
}
