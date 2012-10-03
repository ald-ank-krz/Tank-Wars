package pl.aa.tankwars.engine;

/**
 * klasa przechowuje takie dane dotyczące czołgu, jak liczba pozostałych żyć i właściciel
 * @author Ania
 *
 */
public class Tank extends GameObject
{
	private int livesLeft;
	private String owner;
	Tank()
	{
		livesLeft=Engine.DEFAULT_LIVE;
	}
	Tank(int startLives)
	{
		livesLeft=startLives;
	}
	
	/**
	 * metoda ustawia nową liczbę żyć... chyba niepotrzebna
	 * @param livesLeft
	 */
	public void setLivesLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	/**
	 * metoda zwraca aktualną liczbę żyć, będzie potrzebna podczas sprawdzania, czy czołg żyje
	 * @return
	 */
	public int getLivesLeft()
	{
		return livesLeft;
	}
	
	/**
	 * metoda zmniejsza liczbę żyć o 1 po trafieniu strzałem
	 */
	public void decreaseLivesLeft()
	{
		livesLeft--;
	}
	
}
