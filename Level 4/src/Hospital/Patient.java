package Hospital;

public class Patient {
	boolean caredFor = false;
	boolean Alive = true;
	
	boolean getCaredFor() {
		return caredFor;
	}
	void checkPulse() {
		caredFor = true;
	}
	boolean feelsCaredFor() {
		return getCaredFor();
	}
	boolean getisAlive() {
		return Alive;
	}
	boolean isAlive() {
		return getisAlive();
	}
	void kill() {
		Alive = false;
	}
}
