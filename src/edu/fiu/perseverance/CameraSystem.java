/**
 * 
 */
package edu.fiu.perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author gilbertosabina
 *
 */
public class CameraSystem implements SelfCheckCapable {

	String Compartments; // size of compartment
	String Lens; // type of lens
	
	
	// This takes a image of the surface
	
	void TakeImage(){
		
	}
	
	// This will take a video of the surface
	
	void TakeVideo(){
		
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
