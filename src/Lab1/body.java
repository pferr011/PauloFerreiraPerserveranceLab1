/**
 * 
 */
package Lab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author paulof
 *
 */
public class body implements SelfCheckCapable {
	string wheels;
	string axels;
	string gears;
}

	
	/**
	 * moves the unit forward
	 */
	body move forward

	
	/**
	 * moves the unit backward
	 */
	body move back
	
	
	/**
	 * turns unit left
	 */
	body turn left
	
	/**
	 * turns unit right
	 */
	body turn right
	
	
	/**
	 * spins unit
	 */
	body spin

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
