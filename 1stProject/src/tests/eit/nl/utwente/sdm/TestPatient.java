package tests.eit.nl.utwente.sdm;
import java.sql.SQLException;
import java.util.Date;

import eit.nl.utwente.sdm.Patient;

//test patient
public class TestPatient {
	
	public static void main(String [ ] args){
		Date birthday = new Date();
		Patient test = new Patient(213, "riccardo", "borto", "M", birthday, "Haaksbergerstraat 82", 42, 32, 451);
		test.setHealthIdPat();
		try {
			test.insertPatientHealthData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
