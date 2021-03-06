package tests.eit.nl.utwente.sdm;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import eit.nl.utwente.sdm.DBUtils;
import eit.nl.utwente.sdm.Hospital;

public class TestHospital {
	
	/**
	 * This method assumes no concurent access
	 */
	@Test
	public void testInsertPatient(){
		long initialNoHospitals = DBUtils.getHospitals().size();
		Hospital test = new Hospital("Main Hospital", "Enschede", "Haaksbergerstraat 350");
		try {
			test.persist();
			Assert.assertNotSame(test.getId(), DBUtils.ID_NOT_SET);
			
			long newNoHospitals = DBUtils.getHospitals().size();
			Assert.assertEquals(initialNoHospitals + 1, newNoHospitals);
			test.delete();
			newNoHospitals = DBUtils.getHospitals().size();
			Assert.assertEquals(initialNoHospitals, newNoHospitals);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
