package Hospital;

public class DoctorFullException extends Exception{
	DoctorFullException(String string) {
		System.err.println(string);
	}
}
