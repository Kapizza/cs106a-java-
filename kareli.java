import stanford.karel.SuperKarel;

public class kareli extends SuperKarel {
	public void run() {
		for (int i = 0; i < 4; i++) {
			line();
		}
	}

	private void line() {
		while (frontIsClear()) {
			move();
			putBeeper();
		}
		turnLeft();
	}
}
