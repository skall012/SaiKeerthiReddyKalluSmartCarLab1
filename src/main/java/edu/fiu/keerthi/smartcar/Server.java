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
public class Server implements SelfCheckCapable {

	private String version;
	private String network;
	private String memory;
	
	private void update() {
		
		//provides updates for RasberryPi
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Server";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
}
