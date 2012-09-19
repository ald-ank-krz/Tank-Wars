package pl.aa.tankwars.engine;

/**
 * klasa przechowuje takie dane dotycz¹ce czo³gu, jak liczba pozosta³ych ¿yæ i w³aœciciel
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
	 * metoda ustawia now¹ liczbê ¿yæ... chyba niepotrzebna
	 * @param livesLeft
	 */
	public void setLivesLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	/**
	 * metoda zwraca aktualn¹ liczbê ¿yæ, bêdzie potrzebna podczas sprawdzania, czy czo³g ¿yje
	 * @return
	 */
	public int getLivesLeft()
	{
		return livesLeft;
	}
	
	/**
	 * metoda zmniejsza liczbê ¿yæ o 1 po trafieniu strza³em
	 */
	public void decreaseLivesLeft()
	{
		livesLeft--;
	}
	
}
