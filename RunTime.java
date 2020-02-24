/**
 *
 */
package customcode;

import java.util.concurrent.TimeUnit;

/**
 * @author RyzeNGrind
 *
 */
public class RunTime {

	/**
	 *
	 */

	//private static long elapsedTime;
	//private static long longElapsedTimeInSeconds;
	private long startTime;
	private long endTime;
	//private static double doubleElapsedTimeInSeconds;
	//private static long convert;

	public RunTime() {
		//System.out.println("RunTime constructor running");
		setStartTime();
	}
	public void setStartTime() {
		startTime = System.nanoTime();
		//set startTime;
	}
	public boolean getFlagEndTime() {
		endTime = System.nanoTime();
		return true;
		//set endTime and return true endTime flag
	}
	public void printTime() {
		long elapsedTime = endTime - startTime;
		double doubleElapsedTimeInSeconds = (double) elapsedTime/ 1_000_000_000;
		long convert = TimeUnit.SECONDS.convert(elapsedTime,TimeUnit.NANOSECONDS);

		System.out.println("\n" + "Runtime: " +
				"\n" + elapsedTime + " nanoseconds" +
				"\n" + doubleElapsedTimeInSeconds + " seconds" +
				"\n" + convert + " seconds");
		//System.out.println("RunTime calculation finished");
	}
}
