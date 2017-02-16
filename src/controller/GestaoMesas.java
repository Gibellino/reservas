package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.Mesa;

public class GestaoMesas {

	ArrayList<Mesa> mesas;
	
	public GestaoMesas(){
		
		mesas = new ArrayList<>();
		
	}

	public void addMesa(int lugar, boolean fumador){
		
		int j=0;
		
		Mesa m = new Mesa(mesas.size(),lugar, fumador);
		
		mesas.add(m);
		
		for(int i=0; i<mesas.size(); i++){
			
			System.out.println("\nMesa " + (i+1) + ": "
					+ "\n Lugares: " + mesas.get(i).getLugares());
			
			if(mesas.get(i).isFumador() == true){
				System.out.println(" Fumador: Sim");
			}
			else{
				System.out.println(" Fumador: Não");
			}
			
		}
		
	}
	
}
