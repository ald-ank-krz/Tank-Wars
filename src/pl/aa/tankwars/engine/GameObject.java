package pl.aa.tankwars.engine;

public class GameObject {
	//jest to klasa, kt�ra b�dzie przechowywa�a dane dotycz�ce jakiego� obiektu gry,
	//z tej klasy b�d� dziedziczy� klasy przedstawiaj�ce poszczeg�lne obiekty, jak czo�g,
	//pole wolne lub pole zaj�te lub w przysz�o�ci inny obiekt, kt�ry mo�e by� elementem planszy
	private Position position;
	public void setPosition(Position position)
	{
		this.position = position;
	}
	public Position getPosition()
	{
		return position;
	}
}
