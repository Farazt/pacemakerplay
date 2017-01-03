package controllers;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static play.mvc.Http.Status.OK;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import play.Application;
import play.mvc.Result;
import play.test.Helpers;




public class DashboardTest {

	public static Application fakeApp; 

	 
	  @Before
	  public static void startApp() throws IOException {
	    fakeApp = Helpers.fakeApplication(Helpers.inMemoryDatabase());
	    Helpers.start(fakeApp);
	   
	    
	  }
	 
	  @Test
	  public static void renderDashboard(){
		 Dashboard dash=new Dashboard();
		 Result result=dash.index();
		 assertThat(result.status(), equalTo(OK));
	  }
	  
	  @Test
	  public static void renderUplaod(){
		 Dashboard dash=new Dashboard();
		 Result result=dash.uploadActivityForm();
		 assertThat(result.status(), equalTo(OK));
	  }
	   
	  @Test
	  public static void submitUplaod(){
		  Result result=new Dashboard().submitActivity();
		
		 assertThat(result.status(), equalTo(OK));
	  }
	   
	  
	  
  
	  
}
