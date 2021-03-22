/**
 * 
 */
package edu.fiu.perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author gilbertosabina
 *
 */
public class RoboticArm implements SelfCheckCapable {

	
	String Turret;
	String ContactSensor;
	
	// Drills into surface 
	
	void Drill() {
		
	}
	
	// Turret extends so that it may gain more ground
	void Extend() {
		
	}
	
	// Rover analyzes the object to check if it is worth getting
	
	void Analyze() {
		
	}
	
	// rover retrieves the object
	void Retrieve() {
		
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
