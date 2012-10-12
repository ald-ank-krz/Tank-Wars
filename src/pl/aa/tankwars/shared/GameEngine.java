package pl.aa.tankwars.shared;

import pl.aa.tankwars.engine.Board;

public interface GameEngine {
	
	/**
	 * metoda GUI->Engine 
	 * przekazuje arbitrowi parametry początkowe planszy
	 * @param size długość=szerokość planszy
	 * @param tanksNumber liczba początkowa żyć czołgu
	 * @param tanksNumber liczba czołgów do dyspozycji
	 * @param board ustawienia planszy w postaci dwuwymiarowej tablicy obiektów typu GameObject
	 */
	public void setEngineParams(int size, int LivesNumber, int tanksNumber, Board board);
	
	
	//void setBoardUpdateListener(BoardUpdateListener l);

}
