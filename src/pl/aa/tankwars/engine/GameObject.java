package pl.aa.tankwars.engine;

/**
 * jest to klasa, która będzie przechowywać dane dotyczące jakiegoś obiektu gry,
 * z tej klasy będą dziedziczyć klasy przedstawiające poszczególne obiekty, jak Tank,
 * lub StoneField lub w przyszłości inny obiekt, który może być elementem planszy
 * @author Ania
 *
 */
public class GameObject 
{
	private int[] position;
	/**
	 * Ustawawia pozycję obiektu
	 * @param position pozycja do ustawienia
	 */
	public void setPosition(int[] position)
	{
		this.position = position;
	}
	
	/**
	 * 
	 * @return zwraca pozycję obiektu
	 */
	public int[] getPosition()
	{
		return position;
	}
}
