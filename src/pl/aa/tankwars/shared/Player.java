package pl.aa.tankwars.shared;

import pl.aa.tankwars.engine.Action;
import pl.aa.tankwars.engine.Board;

public interface Player 
{
	/**
	 * metoda GUI->Engine 
	 * przekazuje arbitrowi parametry pocz¹tkowe planszy
	 * @param size d³ugoœæ=szerokoœæ planszy
	 * @param tanksNumber liczba pocz¹tkowa ¿yæ czo³gu
	 * @param tanksNumber liczba czo³gów do dyspozycji
	 * @param board ustawienia planszy w postaci dwuwymiarowej tablicy obiektów typu GameObject
	 */
	public void setEngineParams(int size, int LivesNumber, int tanksNumber, Board board);
	
	/**
	 * metoda arbiter->gracz
	 * przekazuje graczowi aktualne dane dotycz¹ce sytuacji na planszy
	 * nie musi przekazywaæ liczby ¿yæ i liczby czo³gów, poniewaz mo¿na to odczytaæ sobie 
	 * z ustawieñ planszy
	 * @param board ustawienia planszy
	 * 
	 */
	public void setActualBoardInfo(Board board);
	
	/**
	 * do usuniêcia!!!
	 * metoda gracz->arbiter
	 * przekazuje arbitrowi, jak¹ akcjê ma zamiar wykonaæ gracz
	 * @param owner gracz - w³aœciciel czo³gu
	 * @param action ruch lub strza³ czo³gu lub lista akcji wykonywanych przez ¿yj¹ce czo³gi
	 */
	public void action(String owner, Action action);//lub stworzyæ ActionList
	
	public void action(TankList<Tank> newFieldsList);
	//trzeba stworzyæ listê zawieraj¹ca obiekty typu Tank, w ten sposób bêdzie mo¿na przekazaæ
	//tylko nie mam pomys³u, jak przekazaæ rodzaj akcji
}
