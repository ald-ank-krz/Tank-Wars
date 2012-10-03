package pl.aa.tankwars.engine;

import pl.aa.tankwars.shared.GameEngine;
/**
 * klasa - arbiter, która będzie odpowiedzialna za sprawdzanie poprawności przebiegu
 * rozgrywki
 * @author Ania
 *
 */
public class Engine implements GameEngine
{
	public static final int DEFAULT_LIVE = 5;
	public static final int DEFAULT_TANKS = 5;
	private int size;
	private int livesNumber;
	private int tanksNumber;
	//private BoardUpdateListener l;
	public void setEngineParams(int size)
	{
		setEngineParams(size, DEFAULT_LIVE);
	}
	public void setEngineParams(int size, int livesNumber)
	{
		setEngineParams(size, livesNumber, DEFAULT_TANKS);
	}
	public void setEngineParams(int size, int livesNumber, int tanksNumber)
	{
		this.size = size;
		this.livesNumber=livesNumber;
		this.tanksNumber=tanksNumber;
	}
	//public void setBoardUpdateListener(BoardUpdateListener l){
	//
	//}
	public void checkResult()
	{
		//
	}
}
