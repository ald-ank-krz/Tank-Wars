package pl.aa.tankwars.engine;

/**
 * klasa przechowuje takie dane dotycz�ce czo�gu, jak liczba pozosta�ych �y� i w�a�ciciel
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
	 * metoda ustawia now� liczb� �y�... chyba niepotrzebna
	 * @param livesLeft
	 */
	public void setLivesLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	/**
	 * metoda zwraca aktualn� liczb� �y�, b�dzie potrzebna podczas sprawdzania, czy czo�g �yje
	 * @return
	 */
	public int getLivesLeft()
	{
		return livesLeft;
	}
	
	/**
	 * metoda zmniejsza liczb� �y� o 1 po trafieniu strza�em
	 */
	public void decreaseLivesLeft()
	{
		livesLeft--;
	}
	
}
