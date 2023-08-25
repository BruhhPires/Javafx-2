package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML                              // DECLARAÇÃO CORRESTPONDENTE AO CONTROLE VISUAL
	private Button btTest;

	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
}
