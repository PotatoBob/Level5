package Hospital;
public class GeneralPractitioner extends Doctor{
	
	@Override
	boolean performsSurgery() {
		return false;
	}

	@Override
	boolean makesHouseCalls() {
		return true;
	}
}
