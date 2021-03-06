package controllers;

import static parsers.JsonParser.*;
import play.mvc.*;
import java.util.*;
import models.*;

public class PacemakerAPI extends Controller
{  
  //user methods
	  
  public Result users()
  {
    List<User> users = User.findAll();
    return ok(renderUser(users));
  }

  public Result user(Long id)
  {
    User user = User.findById(id);  
    return user==null? notFound() : ok(renderUser(user)); 
  }
  
  public Result createUser()
  {
    User user = renderUser(request().body().asJson().toString());
    System.out.print("User Created"+ user.id);
    user.save();
    return ok(renderUser(user));
  }
  
  public Result deleteUser(Long id)
  {
    Result result = notFound();
    User user = User.findById(id);
    if (user != null)
    {
      user.delete();
      result = ok();
    }
    return result;
  }
  
  public Result deleteAllUsers()
  {
    User.deleteAll();
    return ok();
  }
  
  public Result updateUser(Long id)
  {
    Result result = notFound();
    User user = User.findById(id);
    if (user != null)
    {
      User updatedUser = renderUser(request().body().asJson().toString());
      user.update(updatedUser);
      user.save();
      result = ok(renderUser(user));
    }
    return result;
  }
 
  //activity methods
  
  public Result activities (Long userId)
  {  
    User user = User.findById(userId);
    return ok(renderActivity(user.activities));
  }
   
  public Result createActivity (Long userId)
  { 
    User     user     = User.findById(userId);
    Activity activity = renderActivity(request().body().asJson().toString());  
    
    user.activities.add(activity);
    user.save();
    
    return ok(renderActivity(activity));
  }
  
  public Result activity (Long userId, Long activityId)
  {  
    User     user     = User.findById(userId);
    Activity activity = Activity.findById(activityId);
    
    if (activity == null)
    {
      return notFound();
    }
    else
    {
      return user.activities.contains(activity)? ok(renderActivity(activity)): badRequest();
    }
  }  
  
  public Result deleteActivity (Long userId, Long activityId)
  {  
    User     user     = User.findById(userId);
    Activity activity = Activity.findById(activityId);
 
    if (activity == null)
    {
      return notFound();
    }
    else
    {
      if (user.activities.contains(activity))
      {
        user.activities.remove(activity);
        activity.delete();
        user.save();
        return ok();
      }
      else
      {
        return badRequest();
      }

    }
  }  
  
  public Result updateActivity (Long userId, Long activityId)
  {
    User     user     = User.findById(userId);
    Activity activity = Activity.findById(activityId);
    
    if (activity == null)
    {
      return notFound();
    }
    else
    {
      if (user.activities.contains(activity))
      {
        Activity updatedActivity = renderActivity(request().body().asJson().toString());
        activity.distance = updatedActivity.distance;
        activity.location = updatedActivity.location;
        activity.activityType     = updatedActivity.activityType;
      
        activity.save();
        return ok(renderActivity(updatedActivity));
      }
      else
      {
        return badRequest();
      }
    }
  } 
  
  public Result createLocation (Long activityId)
  { 
	
	Activity    activity     = Activity.findById(activityId);
    Location location = renderLocation(request().body().asJson().toString());  
    System.out.println("Location Value "+ location);
    activity.locations.add(location);
    location.save();
    
    return ok(renderLocation(location));
  }
  
  public Result Locations(Long activityId){
	  
	  Activity activity=Activity.findById(activityId);
	  return ok(renderLocation(activity.locations));
  }
  
  public Result deleteAllLocations(){
	  Location.deleteAll();
	  return ok();
  }
  
  
}
