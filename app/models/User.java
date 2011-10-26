package models;

import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import net.sf.oval.constraint.Email;

import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;


@Entity
public class User extends Model {
  
  @Required  
  public String name;
  
  @Required @Password
  public String password;
  
  @Required @Email
  public String email;

}
