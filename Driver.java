/**
 *
 */
package customcode;

/**
 * @author RyzeNGrind
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create object and initialize constructor
		RunTime rTime = new RunTime();

		//Sample test statement
		System.out.println("Hello World!" +
				"\n" + "This is a driver class testing methods from RunTime");

		//Execute printTime() method
		rTime.printTime();
	}

}
