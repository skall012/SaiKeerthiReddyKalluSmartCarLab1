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
public class Sensor implements SelfCheckCapable{
	
	private String cost;
	private String version;
	private String manufacturer;
	
	private void collectData() {
		
		// It collects data 
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
	 return SelfCheckUtils.randomCheck(0.2);
	}

}
