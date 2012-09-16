package pl.aa.tankwars.engine;

public class GameObject {
	//jest to klasa, która bêdzie przechowywa³a dane dotycz¹ce jakiegoœ obiektu gry,
	//z tej klasy bêd¹ dziedziczyæ klasy przedstawiaj¹ce poszczególne obiekty, jak czo³g,
	//pole wolne lub pole zajête lub w przysz³oœci inny obiekt, który mo¿e byæ elementem planszy
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
