package pl.aa.tankwars.engine;

import pl.aa.tankwars.shared.GameEngine;

public class Engine implements GameEngine{
	private int size;
	private int livesNumber;
	private int tanksNumber;
	//private BoardUpdateListener l;
	public void setEngineParams(int size){
		this.size = size;
		this.livesNumber=5;
		this.tanksNumber=5;
	}
	public void setEngineParams(int size, int livesNumber){
		this.size = size;
		this.livesNumber=livesNumber;
		this.tanksNumber=5;
	}
	public void setEngineParams(int size, int livesNumber, int tanksNumber){
		this.size = size;
		this.livesNumber=livesNumber;
		this.tanksNumber=tanksNumber;
	}
	//public void setBoardUpdateListener(BoardUpdateListener l){
	//
	//}
	public void checkResult(){
		//
	}
}
