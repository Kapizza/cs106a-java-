/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// This method runs program;
	public void run() {
		goToPaper();
		getPaper();
		goHome();
	}
	/**
	 * Precondition		- initial position, facing east;
	 * Postcondition	- Karel moves to "newspaper";
	 */
	private void goToPaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}

	/**
	 * Precondition		- Karel stands on beeper, facing east;
	 * Postcondition	- Karel picks beeper;
	 */
	
	private void getPaper() {
		pickBeeper();
	}

	/**
	 * Precondition		- Karel facing east, stands where beeper was;
	 * Postcondition	- Karel goes to starting position;
	 */
	
	private void goHome() {
		turnAround();
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnRight();
		move();
		turnRight();

	}
}
