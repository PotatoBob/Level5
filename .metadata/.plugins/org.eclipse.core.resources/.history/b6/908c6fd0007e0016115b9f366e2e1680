package Hospital;
import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> docList = new ArrayList<Doctor>();
	ArrayList<Patient> patList = new ArrayList<Patient>();
	
	void addDoctor(Doctor d) {
		docList.add(d);
	}
	ArrayList<Doctor> getDoctors() {
		return docList;
	}
	void addPatient(Patient p) {
		patList.add(p);
	}
	ArrayList<Patient> getPatients() {
		return patList;
	}
	public void assignPatientsToDoctors() throws DoctorFullException{
		System.out.println(docList);
		System.out.println(patList);
		for(Patient p : getPatients()) {
			for(Doctor d : getDoctors()) {
					try {
						d.assignPatient(p);
					}
					catch(DoctorFullException DFE) {
						System.err.println(DFE);
					}
			}
		}
	}
}
