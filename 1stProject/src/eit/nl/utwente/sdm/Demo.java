package eit.nl.utwente.sdm;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		TrustedAuthority ta = new TrustedAuthority();
		/*
		 * Retrieve entities from DB and pass them to the TA for assigning
		 * attributes
		 */
		List<Patient> patients = DBUtils.getPatients();
		List<String> attributes = new ArrayList<String>();
		for (Patient patient : patients) {
			attributes.add(patient.getId() + "");
			attributes.add(patient.getId() + "'s Doc");
			attributes.add(patient.getId() + "'s Insurance");
			attributes.add(patient.getId() + "'s Employer");
		}
		/*
		 * Add more IDs for the patients to come
		 */
		ta.setup(attributes);
	}

}
