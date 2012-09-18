package pl.aa.tankwars.engine;

/**
 * jest to klasa, która bêdzie przechowywa³a dane dotycz¹ce jakiegoœ obiektu gry,
 * z tej klasy bêd¹ dziedziczyæ klasy przedstawiaj¹ce poszczególne obiekty, jak Tank,
 * lub StoneField lub w przysz³oœci inny obiekt, który mo¿e byæ elementem planszy
 * @author Ania
 *
 */
public class GameObject 
{
	private int[] position;
	/**
	 * Ustawawia pozycjê obiektu
	 * @param position pozycja do ustawienia
	 */
	public void setPosition(int[] position)
	{
		this.position = position;
	}
	
	/**
	 * 
	 * @return zwraca pozycjê obiektu
	 */
	public int[] getPosition()
	{
		return position;
	}
}
