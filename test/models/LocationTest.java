package models;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;

import play.test.WithApplication;

public class LocationTest extends WithApplication {
	
	@Test
	public void createAndRetrieveLocationForActivity() {
		//Because of the associative relation between user activity and location first we need to create a user and a corresponding activity than add location to that activity
	    new User("Jim", "Simpson", "jim@simpson.com", "secret").save();
	    User joesoap = User.findByEmail("jim@simpson.com");
	    
	    BigDecimal coordinate=new BigDecimal("1.0");
	    
	    Location location=new Location(coordinate,coordinate);
	    BigDecimal duration=new BigDecimal("1.111");
	    BigDecimal distance=new BigDecimal("1.0");
	    Activity activty=new Activity("Run", "Tramore", distance,"10-02-2012",duration);
	    activty.locations.add(location);
	    joesoap.activities.add(activty);
		joesoap.save();
		
	    // Retrieve the activity and than check for the location
	    Activity activity = Activity.findById(1l);
	   
	    assertTrue(activity.locations.contains(location)); 
	    //Test that the fields in the returned activity was set up correctly
	    assertNotNull(activity.locations);
		assertThat(coordinate, equalTo(activity.locations.get(0).latitude));
		assertThat(coordinate, equalTo(activity.locations.get(0).longitude));
		
	}



}
