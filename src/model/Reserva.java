package model;

public class Reserva {

	
	private int id_reserva;
	private Cliente cliente;
	private Mesa mesa;
	private int n_pessoas;
	private String data;
	
	public Reserva(int id_reserva, Cliente cliente, Mesa mesa, int n_pessoas, String data) {
		super();
		this.id_reserva = id_reserva;
		this.cliente = cliente;
		this.mesa = mesa;
		this.n_pessoas = n_pessoas;
		this.data = data;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getN_pessoas() {
		return n_pessoas;
	}

	public void setN_pessoas(int n_pessoas) {
		this.n_pessoas = n_pessoas;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
