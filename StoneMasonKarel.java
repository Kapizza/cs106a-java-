/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	//This method run program;
	public void run() {
		while (frontIsClear()) {
			build();
			goToNext();
		}
		build();
	}

	/**
	 * Precondition		- initial position, facing East;
	 * Postcondition	- Karel moves up and puts beepers where needed;
	 */
	
	private void build() {
		turnLeft();
		check();
		while (frontIsClear()) {
			move();
			check();
		}
		goDown();
		turnLeft();
	}

	/**
	 * Precondition		- Karel stand at the bottom of column facing East;
	 * Postcondition	- Karel moves to next column;
	 */
	private void goToNext() {
		if (frontIsClear()) {
			for (int i = 0; i < 4; i++) {
				move();
			}
		}
	}
	
	// Karel moves puts beeper where needed;
	private void check() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}

	/**
	 * Precondition		- Karel stands top of column;
	 * Postcondition	- Karel moves down to the first row;
	 */
	
	private void goDown() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
	}
}
