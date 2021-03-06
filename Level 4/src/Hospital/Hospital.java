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
	void add(Object o) {
		if(o instanceof Doctor) {
			addDoctor((Doctor) o);
		} else if(o instanceof Patient) {
			addPatient((Patient) o);
		}
	}
	public void assignPatientsToDoctors() throws DoctorFullException{
		int count = 0;
		for(Doctor d : getDoctors()) {
			for(Patient p : getPatients()) {
				if(count<3) {
					d.assignPatient(p);
					count++;
				} else {
					continue;
				}
			}
			count = 0;
			for(Patient p : d.assignedList) {
			patList.remove(p);	
			}
			continue;
		}
	}
}
