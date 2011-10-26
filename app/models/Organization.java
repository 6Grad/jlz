package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Organization extends Model {

  @Required
  public String name;
  @Required
  public String tile;
  public String description;
  
}
