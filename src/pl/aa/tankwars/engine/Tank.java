package pl.aa.tankwars.engine;

public class Tank extends GameObject

//klasa przechowuje dane o czo³gu, obiekt Tank mo¿na utworzyæ z domyœl¹ liczb¹ ¿yæ pocz¹tkowych 5 lub
//podaj¹c inn¹ liczbê ¿yæ pocz¹tkowych
//pisanie komantarzy dzia³a jak metoda kaczuszki, wiêc w³aœnie wpad³am na pomys³, ¿e
//trzeba dopisaæ mutator i akcesor, za pomoca których bêdzie mo¿na dostac siê do 
//pola przechowuj¹cego liczbê pozosta³ych ¿yæ
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
	
	public void setLivesLeft(int livesLeft)
	{
		this.livesLeft = livesLeft;
	}
	
	public int getLivesLeft()
	{
		return livesLeft;
	}
}
