package pl.aa.tankwars.engine;

public class Tank extends GameObject

//klasa przechowuje dane o czo�gu, obiekt Tank mo�na utworzy� z domy�l� liczb� �y� pocz�tkowych 5 lub
//podaj�c inn� liczb� �y� pocz�tkowych
//pisanie komantarzy dzia�a jak metoda kaczuszki, wi�c w�a�nie wpad�am na pomys�, �e
//trzeba dopisa� mutator i akcesor, za pomoca kt�rych b�dzie mo�na dostac si� do 
//pola przechowuj�cego liczb� pozosta�ych �y�
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
