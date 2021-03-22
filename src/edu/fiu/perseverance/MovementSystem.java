/**
 * 
 */
package edu.fiu.perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author gilbertosabina
 *
 */
public class MovementSystem implements SelfCheckCapable {
	
	String Wheels; //Type of wheels
	String WheelSize; // Size of wheels
	String WheelBreaks; // Types of Breaks on wheels
	
	
	/**
	 *  The rover will move to the left
	 */
	void Move_left(){
		
	}
	
	/**
	 *  The rover will move to the right
	 */
	void Move_right(){
		
	}
	
	
	/**
	 *  The rover will accelerate forward
	 */
	void Accelerate_Forward(){
		
	}
	
	
	/**
	 *  The rover will move to the backwards
	 */
	void Accelerate_Backwards(){
		
	}
	
	/**
	 *  The rover will move to the break
	 */
	
	void Break() {
		
	}
	
	/**
	 *  The rover will move to the rotate
	 */
	void Rotate() {
		
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
