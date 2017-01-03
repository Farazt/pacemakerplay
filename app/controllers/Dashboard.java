package controllers;

import java.util.List;

import controllers.Accounts.Login;
import models.Activity;

import models.User;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Dashboard extends Controller
{
	
  public Result index()
  {
    String email = session().get("email");
    User user = User.findByEmail(email);
    return ok(dashboard_main.render(user.activities, user));
    //return ok(dashboard_main.render(user.activities));
  }
  
  public Result uploadActivityForm()
  {
    return ok(dashboard_uploadactivity.render());
  }  
  
  
 /* public Result follow(){
	  Form<Friends> boundForm = Form.form(Friends.class).bindFromRequest(); 
	  Friends friend=boundForm.get();
	  System.out.print("Bounded Form ==" + friend);
	  
	  return null;
  }*/
  
  public  Result report()
  {
	  
    String email = session().get("email");
    User user = User.findByEmail(email);
    return ok(dashboard_report.render(user.activities, user));
  }
  
  public  Result friendList()
  {	
	 
	String email = session().get("email");
    User user = User.findByEmail(email);
	List<User> users = User.findAll();
	System.out.println("User In here"+ users);
    return ok(friends_follow.render(users,user));
  
  }
  
  public Result submitActivity()
  {
	Form<Activity> boundForm = Form.form(Activity.class).bindFromRequest();    
    Activity activity = boundForm.get();
    if(boundForm.hasErrors()) 
    {
      return badRequest();
    }
    String email = session().get("email");
    User user = User.findByEmail(email);
    user.activities.add(activity);
    user.save();
    return redirect (routes.Dashboard.index());
  }
  
  
  


}
