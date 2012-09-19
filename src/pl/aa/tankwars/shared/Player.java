package pl.aa.tankwars.shared;

import pl.aa.tankwars.engine.Action;
import pl.aa.tankwars.engine.Board;

public interface Player 
{
	/**
	 * metoda GUI->Engine 
	 * przekazuje arbitrowi parametry pocz�tkowe planszy
	 * @param size d�ugo��=szeroko�� planszy
	 * @param tanksNumber liczba pocz�tkowa �y� czo�gu
	 * @param tanksNumber liczba czo�g�w do dyspozycji
	 * @param board ustawienia planszy w postaci dwuwymiarowej tablicy obiekt�w typu GameObject
	 */
	public void setEngineParams(int size, int LivesNumber, int tanksNumber, Board board);
	
	/**
	 * metoda arbiter->gracz
	 * przekazuje graczowi aktualne dane dotycz�ce sytuacji na planszy
	 * nie musi przekazywa� liczby �y� i liczby czo�g�w, poniewaz mo�na to odczyta� sobie 
	 * z ustawie� planszy
	 * @param board ustawienia planszy
	 * 
	 */
	public void setActualBoardInfo(Board board);
	
	/**
	 * do usuni�cia!!!
	 * metoda gracz->arbiter
	 * przekazuje arbitrowi, jak� akcj� ma zamiar wykona� gracz
	 * @param owner gracz - w�a�ciciel czo�gu
	 * @param action ruch lub strza� czo�gu lub lista akcji wykonywanych przez �yj�ce czo�gi
	 */
	public void action(String owner, Action action);//lub stworzy� ActionList
	
	public void action(TankList<Tank> newFieldsList);
	//trzeba stworzy� list� zawieraj�ca obiekty typu Tank, w ten spos�b b�dzie mo�na przekaza�
	//tylko nie mam pomys�u, jak przekaza� rodzaj akcji
}
