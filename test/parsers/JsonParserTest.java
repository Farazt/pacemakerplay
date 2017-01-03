package parsers;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;

import models.Activity;
import models.Location;
import models.User;
import play.test.WithApplication;

public class JsonParserTest extends WithApplication{

	@Test
	public void userConvertsToJsonStringAndBackAgain() {		
  	    // Create a new user and save it in the database
	    new User("Jim", "Simpson", "jim@simpson.com", "secret").save();
	    
	    // Retrieve the user we just added by their email address
	    User joesoap = User.findByEmail("jim@simpson.com");
	    
	    //Test the parsing of the User into a String
	    String jsonReturned = JsonParser.renderUser(joesoap);
	    
	    // Test the String returned from the parse contains the user data
	    assertNotNull(jsonReturned);
	    assertThat(jsonReturned, containsString("jim@simpson.com"));
	    assertThat(jsonReturned, containsString("Jim"));
	    assertThat(jsonReturned, containsString("Simpson"));
	    assertThat(jsonReturned, containsString("secret"));
	 
	    // Test the String returned from the parse re-renders into user object format
	    assertThat(joesoap, equalTo(JsonParser.renderUser(jsonReturned)));    
	}
	
	@Test
	public void activityConvertsToJsonStringAndBackAgain() {		
		// Create a new user and save it in the database
	    new User("Jim", "Simpson", "jim@simpson.com", "secret").save();
	    
	    // Retrieve the user we just added by their email address
	    User joesoap = User.findByEmail("jim@simpson.com");
	    BigDecimal duration=new BigDecimal("1.111");
	    BigDecimal distance=new BigDecimal("1.111");
	    
	    // Create a new activity and save it in the database
	    joesoap.activities.add(new Activity("Run", "Tramore", duration,"10-02-2011",distance));
		joesoap.save();
		
	    // Retrieve the activity we just added; id should be 1
	    Activity activity = Activity.findById(1l);
	    
	    //Test the parsing of the Activity into a String
	    String jsonReturned = JsonParser.renderActivity(activity);
	    
	    // Test the String returned from the parse contains some activity data
	    assertNotNull(jsonReturned);
	    assertThat(jsonReturned, containsString("Run"));
	    assertThat(jsonReturned, containsString("Tramore"));
	  	 
	    // Test the String returned from the parse re-renders into activity object format
	    assertThat(activity, equalTo(JsonParser.renderActivity(jsonReturned)));    
	}
	@Test
	public void locationConvertsToJsonStringAndBackAgain() {		
		// Create a new user and save it in the database
	    new User("Jim", "Simpson", "jim@simpson.com", "secret").save();
	    
	    // Retrieve the user we just added by their email address
	    User joesoap = User.findByEmail("jim@simpson.com");
	    BigDecimal latitude=new BigDecimal("1.0");
	    BigDecimal longitude=new BigDecimal("1.0");
	    Location location=new Location(latitude, longitude);
	    
	    //Test the parsing of the Activity into a String
	    String jsonReturned = JsonParser.renderLocation(location);
	    
	    // Test the String returned from the parse contains some activity data
	    assertNotNull(jsonReturned);
	    
	    // Test the String returned from the parse re-renders into activity object format
	    assertThat(location, equalTo(JsonParser.renderLocation(jsonReturned)));    
	}
	
	
}	



