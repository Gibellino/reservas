package controller;

import java.util.ArrayList;

import model.Mesa;

public class GestaoMesas {

	ArrayList<Mesa> mesas;
	
	public GestaoMesas(){
		
		mesas = new ArrayList<>();
		
	}

	public void addMesa(int lugar, boolean fumador){
		
		Mesa m = new Mesa(mesas.size(),lugar, fumador);
		
		mesas.add(m);
		
	}
	
}
