/**
 * 
 */
package edu.fiu.keerthi.smartcar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Sai Keerthi Reddy
 *
 */
public class App implements SelfCheckCapable {
	
	private String name;
	private String manufacturer;
	private String price;
	private String model;
	
	private void activateSmartCar() {
		
		//Activates Smart car
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "App";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
