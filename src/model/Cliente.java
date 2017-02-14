package model;

public class Cliente {

	private int id_Cliente;
	private String nome;
	private String contacto;
	
	public Cliente(int id_Cliente, String nome, String contacto) {
		super();
		this.id_Cliente = id_Cliente;
		this.nome = nome;
		this.contacto = contacto;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
}
