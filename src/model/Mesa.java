package model;

public class Mesa {
	
	private int id_mesa;
	private int lugares;
	private boolean fumador;
	
	public Mesa(int id_mesa, int lugares, boolean fumador) {
		super();
		this.id_mesa = id_mesa;
		this.lugares = lugares;
		this.fumador = fumador;
	}

	public int getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public boolean isFumador() {
		return fumador;
	}

	public void setFumador(boolean fumador) {
		this.fumador = fumador;
	}
	
	

}
