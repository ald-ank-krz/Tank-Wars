package pl.aa.tankwars.engine;

public class Tank extends GameObject
{
	int livesLeft;
	Tank()
	{
		livesLeft=5;
	}
	Tank(int startLives)
	{
		livesLeft=startLives;
	}
	
}
