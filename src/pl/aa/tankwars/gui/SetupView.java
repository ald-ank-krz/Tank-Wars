package pl.aa.tankwars.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//pobieranie danych wejsciowych
public class SetupView extends JFrame implements ActionListener{
	JLabel lBoardSize, lInactiveField, lUnitNr;
	JTextField tBoardSize, tInactiveField, tUnitNr;
	
	//wyglad okna startowego
	public SetupView(){
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub	
	}	
}
