/**
 * 
 */
package edu.fiu.keerthi.smartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author keerthi
 *
 */
public class RasberryPi implements SelfCheckCapable {

	private String version;
	private String memory;
	private String operatingSystem;
	private String network;
	
	private void activateCamera() {
		
		//Activates camera
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rasberry Pi";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
