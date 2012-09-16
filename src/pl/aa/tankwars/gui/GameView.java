package pl.aa.tankwars.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//wyglad gry - plansza, dane wejsciowe, aktualna tura, liczba zyc itp.
public class GameView extends JFrame implements ActionListener {
		
	public GameView(){
		super("TANK WARS");
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
			
		//panel z plansza
		//JPanel board = new BoardView; 
		//add(board);
		
		//panel pokazujacy aktualna ture, liczbe zyc czolgow
		//JPanel gameData = new GameDataView;
		//add(gameData);
		
		// panel wyswietlajacy parametry gry
		//JPanel startData = new StartDataView; 
		//add(startData);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
