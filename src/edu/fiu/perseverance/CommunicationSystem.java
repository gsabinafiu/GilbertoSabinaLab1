/**
 * 
 */
package edu.fiu.perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * This is the Communication System class in which you will see an antenna/ receiver
 * that is able to communicate back to headquarters back on earth.
 * @author gilbertosabina
 *
 */
public class CommunicationSystem implements SelfCheckCapable {

	String antenna; // Attached Antenna used to point to nearby satellite
	String receiver; // Receiver device used to receive communications
	
	
	/**
	 * Receives communications from NASA headquarters (Remote Control)
	 */
	String ReceiveCommand() {
		return "Command from NASA";
	}
	
	/**
	 * Sends Response to NASA headquarters (Remote Control)
	 */
	void SendResponse() {
		
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
