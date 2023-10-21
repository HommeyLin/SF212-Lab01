/*
 * File: PotholeFillingKarel.java
 * ------------------------------
 * The PotholeFillingKarel class puts a beeper into a pothole
 * on 2nd Avenue.
 */

import stanford.karel.*;

public class PotholeFillingKarel extends Karel {

	// You fill in this part
	public void run() {
		move();
		found();
		move();
		turnRight();
		move4();
		
		
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void move4() {
		move();
		move();
		move();
		move();
	}
	
	private void found() {
		turnRight();
		move();
		putBeeper();
		turnLeft();
		turnLeft();
	}
	
}