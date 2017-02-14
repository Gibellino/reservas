package view;

import controller.GestaoMesas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Fmesas extends Scene{

	Group gn;
	GestaoMesas gM;
	
	public Fmesas(double width, double height, GestaoMesas gM) {
		
		super(new Group(), width, height);
		
		gn = (Group) this.getRoot();
		this.gM = gM;
		
		init();
	}

	private void init(){
		
		GridPane g = new GridPane();
		
		Label lb1 = new Label("Lotação");
		CheckBox cb1 = new CheckBox("Fumador");
		TextField tf1 = new TextField();
		Button bt1 = new Button("Adicionar");
		
		g.add(lb1, 0, 0);
		g.add(tf1, 1,0);
		g.add(cb1, 0, 1);
		g.add(bt1, 1, 2);
		
		gn.getChildren().add(g);
		
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				gM.addMesa(Integer.getInteger(tf1.getText()), cb1.isSelected());
				
			}
		});
		
	}
	
}
