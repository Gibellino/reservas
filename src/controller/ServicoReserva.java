package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Mesa;
import model.Reserva;

public class ServicoReserva {

	ArrayList<Reserva> reservas;

	public ServicoReserva(){
		
		reservas = new ArrayList<>();
		
	}
	
	public void addReserva(Cliente c, Mesa m, int n, String h){
		
		Reserva res = new Reserva(reservas.size(), c, m, n, h);
		
		reservas.add(res);
	}
	
}
