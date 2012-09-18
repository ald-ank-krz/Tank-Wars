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
	
	public void setLivesLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	public int getLivesLeft()
	{
		return livesLeft;
	}
}
