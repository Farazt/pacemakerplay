package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Objects;

import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

@Entity
@Table(name="my_activity")
public class Activity extends Model{

  @Id
  @GeneratedValue
  public Long   id;
  
  public String activityType;
  public String location;
  public String date;
  @Column(columnDefinition = "NUMERIC")
  public BigDecimal distance;
  @Column(columnDefinition = "NUMERIC")
  public BigDecimal duration;
  //public String date;
  public static Find<String, Activity> find = new Find<String, Activity>(){};
  @OneToMany(cascade=CascadeType.ALL)
  public List<Location> locations = new ArrayList<Location>();
 
	   
  public Activity(String type, String location, BigDecimal distance, String date,BigDecimal duration){
    this.activityType = type;
    this.location = location;
    this.distance = distance;
    this.date = date;
    this.duration = duration;
  }
	  
  
  public String toString(){
    return toStringHelper(this).addValue(id)
                                       .addValue(activityType)
                                       .addValue(location)
                                       .addValue(distance)
                                       .addValue(date)
                                       .addValue(duration)
                                       .toString();
   }
  
  @Override
  public boolean equals(final Object obj)
  {
    if (obj instanceof Activity)
    {
      final Activity other = (Activity) obj;
      return Objects.equal(activityType, other.activityType)
          && Objects.equal(location, other.location)
          && Objects.equal(distance, other.distance)
          && Objects.equal(date, other.date)
          && Objects.equal(duration, other.duration);
    }
    else
    {
      return false;
    }
  }
	  
  @Override  
  public int hashCode()  
  {  
     return Objects.hashCode(this.id, this.activityType, this.location, this.distance, this.date);  
  } 
	
  public static Activity findById(Long id)
  {
    return find.where().eq("id", id).findUnique();
  }
  
  public static List<Activity> findAll()
  {
    return find.all();
  }

  public void update (Activity activity)
  {
    this.activityType    = activity.activityType;
    this.location = activity.location;
    this.distance = activity.distance;
    this.date=activity.date;
  }
  
  public static void deleteAll(){
    for (Activity activity: Activity.findAll())
    {
      activity.delete();
    }
  }
  
}
