/**
 * 
 */
package Lab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author paulof
 *
 */
public class detection implements SelfCheckCapable {
	string obstruction scanner;
	string thermal sensor;
	string humidity sensor;
}


/**
 * checks for any objects obstructing rover path
 */
detection obstruction check { }

  
/**
 * detects temperature around rover 
 */

detection temperature check { }

/**
 * sends error data to command center 
 * @return data to command center
 */
detection transmit obstruction error data {}

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
