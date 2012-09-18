package pl.aa.tankwars.engine;

/**
 * jest to klasa, kt�ra b�dzie przechowywa�a dane dotycz�ce jakiego� obiektu gry,
 * z tej klasy b�d� dziedziczy� klasy przedstawiaj�ce poszczeg�lne obiekty, jak Tank,
 * lub StoneField lub w przysz�o�ci inny obiekt, kt�ry mo�e by� elementem planszy
 * @author Ania
 *
 */
public class GameObject 
{
	private int[] position;
	/**
	 * Ustawawia pozycj� obiektu
	 * @param position pozycja do ustawienia
	 */
	public void setPosition(int[] position)
	{
		this.position = position;
	}
	
	/**
	 * 
	 * @return zwraca pozycj� obiektu
	 */
	public int[] getPosition()
	{
		return position;
	}
}
