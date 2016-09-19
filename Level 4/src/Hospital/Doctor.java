
package Hospital;
import java.util.ArrayList;

public class Doctor {
	boolean Evil = false;
	ArrayList<Patient> assignedList = new ArrayList<Patient>();
	
	Doctor() {
		
	}
	public void assignPatient(Patient p) throws DoctorFullException {
		

		/*if(assignedList.size()<3){
			System.out.println(assignedList.size());
			assignedList.add(p);
		}else 
			throw new DoctorFullException("FULL");
		*/
		if(assignedList.size()==3) {
			throw new DoctorFullException("FULL");
		} else {
			assignedList.add(p);
		}
		
	}
	ArrayList<Patient> getPatients() {
		return assignedList;
	}
	void doMedicine() {
		for(Patient p: assignedList) {
			if(this.isEvil())
				p.kill();
			else {
				p.caredFor=true;
			}
		}
	}
	boolean performsSurgery() {
		return docSurgeon(this);
	}
	boolean docSurgeon(Doctor d) {
		if(d instanceof Surgeon) {
			return true;
		} else
			return false;
	}
	boolean makesHouseCalls() {
		return docGP(this);
	}
	boolean docGP(Doctor d) {
		if(d instanceof GeneralPractitioner) {
			return true;
		}
		else
			return false;
	}
	boolean getisEvil() {
		return Evil;
	}
	boolean isEvil() {
		return getisEvil();
	}
	void joinTheDarkSide() {
		Evil = true;
	}
	
}
