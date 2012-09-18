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
	
	public void setLivesLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	public int getLivesLeft()
	{
		return livesLeft;
	}
}
