package modelo;

public class Criatura extends Personaje{

	private String tipo;
	private int puntosAtaque;
	
	public Criatura() {
		
	}
	
	
	
	public Criatura(String nombre, int nivel, int salud, int fuerza, String tipo, int puntosAtaque) {
		super(nombre, nivel, salud, fuerza);
		this.tipo = tipo;
		this.puntosAtaque = puntosAtaque;
	}


	

	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getPuntosAtaque() {
		return puntosAtaque;
	}



	public void setPuntosAtaque(int puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}



	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "***CRIATURA***\nTipo: " + tipo + "\nPuntos de ataque: " + puntosAtaque + "\nNombre: " + getNombre()
				+ "\nNivel: " + getNivel() + "\nSalud: " + getSalud() + "\nFuerza: " + getFuerza();
	}
	
	

}
