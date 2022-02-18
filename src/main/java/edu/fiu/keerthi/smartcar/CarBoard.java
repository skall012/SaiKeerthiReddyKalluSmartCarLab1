/**
 * 
 */
package edu.fiu.keerthi.smartcar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author keerthi
 *
 */
public class CarBoard implements SelfCheckCapable {
	
	private String processor;
	private String chip;
	private String cable;
	private String connector;
	
	private void activateLED() {
		
		// Activates LEDs 
	}
	
	private void activateSensor() {
		
		//Activates sensors
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Car Board";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
