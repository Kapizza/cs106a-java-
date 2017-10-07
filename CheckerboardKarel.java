/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	//This method runs program;
	
	public void run() {
		check();
		while (frontIsClear()) {
			oneRow();
			goToNext();
		}
	}

	/**
	 * Precondition		- initial position, facing east;
	 * Postcondition	- Karel moves front and puts beepers on odd numbers;
	 */
	
	private void oneRow() {
		putBeeper();
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}
	}

	/**
	 * Precondition		- Karel has covered 1 row;
	 * Postcondition	- Karel moves to next row. 
	 */
	
	private void goToNext() {
		if (facingEast()) {
			goWest();
		} else {
			goEast();
		}
	}

	/**
	 * Precondition		- Karel is facing West;
	 * Postcondition	- Karel moves up by 1 unit and gets ready to go East;
	 */
	
	private void goEast() {
		turnRight();
		if (frontIsClear()) {
			if (beepersPresent()) {
				move();
				turnRight();
				move();
			} else {
				move();
				turnRight();
			}
		}
	}

	/**
	 * Precondition		- Karel is facing East;
	 * Postcondition	- Karel moves up by 1 unit and gets ready to go West;
	 */
	
	private void goWest() {
		turnLeft();
		if (frontIsClear()) {
			if (beepersPresent()) {
				move();
				turnLeft();
				move();
			} else {
				move();
				turnLeft();
			}
		}
	}
	
	/**
	 * Precondition		- Initial position facing East;
	 * Postcondition	- Karel is ready for all kind of world :) ;
	 */
	
	// This method checks speacial worlds like: 1x1, 1x2, 2x1 etc.;

	private void check() {
		if (frontIsBlocked()) {
			turnLeft();
			if(frontIsBlocked()){
				putBeeper();
			}
		}
	}

}
