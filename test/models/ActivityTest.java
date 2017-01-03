package models;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import parsers.JsonParser;
import play.test.WithApplication;
import static org.hamcrest.CoreMatchers.*;

public class ActivityTest extends WithApplication{
//automatically ensures that a fake application is started
//and stopped for each test method.
		
	@Test
	public void createAndRetrieveActivityForUser() {
		// Create a new user and save it in the database
	    new User("Jim", "Simpson", "jim@simpson.com", "secret").save();
	    User joesoap = User.findByEmail("jim@simpson.com");
	    BigDecimal duration=new BigDecimal("1.111");
	    BigDecimal distance=new BigDecimal("1.111");
	    joesoap.activities.add(new Activity("Run", "Tramore", duration,"10-02-2011",distance));
		joesoap.save();
		
	    // Retrieve the activity we just added; id should be 1
	    Activity activity = Activity.findById(1l);
	      
	    //Test that the fields in the returned activity was set up correctly
	    assertNotNull(activity);
		assertThat("Run", equalTo(activity.activityType));
		assertThat("Tramore", equalTo(activity.location));
		assertThat(distance, equalTo(activity.distance));
	
	}
	@Test
	public void createAndUpdateActivity(){
		BigDecimal duration=new BigDecimal("1.111");
	    BigDecimal distance=new BigDecimal("1.0");
		Activity activity=new Activity("Cycle","Lahore",duration,"10-02-2011",distance);
		activity.update(new Activity("walk", "Karachi", duration, "10-12-2012",distance));
		
		assertThat("walk", equalTo(activity.activityType));
		
	}
	
	@Test
	public void listAlltheCreatedActivitiesForUser(){
		
		assertNotNull(Activity.findAll());		
	}
	
	@Test
	public void deleteAllActivities(){
		Activity.deleteAll();
		assertThat(Activity.findAll(), equalTo(null));
	}
}