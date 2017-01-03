package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.math.BigDecimal;
import java.util.List;

import com.google.common.base.Objects;

import javax.persistence.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;


@Entity
@Table(name="location")
public class Location extends Model
{
  @Id
  @GeneratedValue
  public Long id;
  @Column(columnDefinition = "NUMERIC")
  public BigDecimal latitude;
  @Column(columnDefinition = "NUMERIC")
  public BigDecimal longitude;
  public static Find<String, Location> find = new Find<String, Location>(){};
 

  public Location (BigDecimal latitude, BigDecimal longitude)
  {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  @Override
  public boolean equals(final Object obj)
  {
    if (obj instanceof Location)
    {
      final Location other = (Location) obj;
      return Objects.equal(latitude, other.latitude) 
          && Objects.equal(longitude, other.longitude);
    }
    else
    {
      return false;
    }
  }

  public static Location findById(Long id)
  {
    return find.where().eq("id", id).findUnique();
  }
  

  public String toString()
  {
    return Objects.toStringHelper(this)
        .add("Latitude", latitude)
        .add("Longitude", longitude).toString();
  }
  
  
  public static List<Location> findAll()
  {
    return find.all();
  }
  public static void deleteAll()
  {
    for (Location loc: Location.findAll())
    {
      loc.delete();
    }
  }


}