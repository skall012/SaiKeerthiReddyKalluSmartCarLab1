/**
 * 
 */
package edu.fiu.keerthi.smartcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author keerthi
 *
 */
public class SmartCar implements GenericComponent{

	/**
	 * @param args
	 */
	
	private String name;
	private String price;
	private String manufactuterer;
	private String model;
	private String size;
	private App myApp;
	private CarBoard myCarBoard;
	private RasberryPi myRasberryPi;
	private Sensor mySensor;
	private Server myServer;
	
	
	public SmartCar() {
		
		myApp = new App();
		myCarBoard = new CarBoard();
		myRasberryPi = new RasberryPi();
		myServer = new Server();
		mySensor = new Sensor();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private void activateCarBoard() {
		
		//Activates carBoard
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Free rover 4WD";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myApp, myCarBoard, mySensor, myRasberryPi, myServer); // add all your sub components
		return internalComponents;
	}

}
