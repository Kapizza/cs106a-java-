/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	/**
	 * This method runs this program;
	 */
	public void run() {
		findMid();
		goToFirstRow();
	}

	/**
	 * Precondition 	- initial position, Karel facing East; 
	 * Postcondition	- Karel moves middle point of last row;
	 */

	
	private void findMid() {
		check();
		while (frontIsClear()) {
			goUp();
			goRight();

		}
	}

	/**
	 * Precondition		- Karel stands on middle point of last row; 
	 * Postcondition	- Karel moves middle point of first row;
	 */
	
	//This method moves Karel to fisrt row;
	
	private void goToFirstRow() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
		putBeeper();
	}

	/**
	 * Precondition		- Karel has moved up by 2 units; 
	 * Postcondition	- Karel moves right by 1 unit;
	 */

	private void goRight() {
		if (frontIsClear()) {
			turnRight();
			move();
		}
	}

	/**
	 * Precondition 	- Initial position or has moved right by 1 unit; 
	 *					Facing East; 
	 * Postcondition 	- Karel moves up by 2 unit;
	 */

	private void goUp() {
		turnLeft();
		if (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
			}
		}
	}
	
	/**
	 * Precondition		- initial position, Karel facing East; 
	 * Postcondition	- Karel checks special condition or starts searching
	 * 					middle point;
	 */
	
	private void check(){
		if (frontIsClear()){
			move();
		}
	}

}
