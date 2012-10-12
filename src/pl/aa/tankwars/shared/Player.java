package pl.aa.tankwars.shared;

import pl.aa.tankwars.engine.Action;
import pl.aa.tankwars.engine.Tank;

/**
 * 
 * @author Ania
 *
 */
public interface Player 
{	
	
	public void setPlayerParams(Tank TanksList);
	/**
	 * metoda gracz->arbiter
	 * przekazuje arbitrowi, jaką akcję ma zamiar wykonać gracz
	 * @param actionList lista akcji wykonywanych przez żyjące czołgi
	 */
	public void getActions(Action ActionList);
	
}
