package Hospital;
public class Surgeon extends Doctor {
	
	
	@Override
	boolean performsSurgery() {
		return true;
	}

	@Override
	boolean makesHouseCalls() {
		return false;
	}
}
