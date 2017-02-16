package view;

import java.io.IOException;

import controller.GestaoMesas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
		Button bt2 = new Button("Listar Mesas");
		
		g.add(lb1, 0, 0);
		g.add(tf1, 1,0);
		g.add(cb1, 0, 1);
		g.add(bt1, 1, 2);
		g.add(bt2, 2, 2);
		
		gn.getChildren().add(g);
		
		bt1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				gM.addMesa(Integer.parseInt(tf1.getText()), cb1.isSelected());
				
				/*Stage stage = new Stage();
				
				FListM janela_List_M = new Fmesas(320, 240,);
				
				stage.setScene(janela_M);
				stage.setTitle("Add Mesa");
				stage.show();*/
				
				
				//init2();
			}
		});
		
	}
	
	/*private void init2(){
		
		
		bt2.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
		
					gM = new GestaoMesas();
				
			        Stage stage = new Stage();
					Fmesas janela_M = new Fmesas(320, 240, gM);
					
					stage.setScene(janela_M);
					stage.setTitle("My New Stage Title");
					stage.show();
					
					
					
					
				
			}
		});
		
	}*/
	
}
