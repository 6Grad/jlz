package controllers;

import java.util.List;

import models.Organization;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

import play.data.validation.Required;
import play.data.validation.Validation;
import play.mvc.Controller;

/**
 * Facebook Application. width: 760px.
 */

public class App extends Controller {

  /* entry */
  public static void index() {
    
    List<Organization> orgs = Organization.all().fetch(9); 
    
    render(orgs);
  }
  
  /* Details*/
  public static void org(@Required long orgId) {
    Organization o = Organization.findById(orgId);
    if (o == null) {
      error("org not found");
    }
    render(o);
  }
  
  /* Donate */
  public static void donate() {
    
  }
  
  /* About u*/
  public static void about() {
    render();
  }
  

  /**
   * server facebook js api.
   */
  public static void channel() {
    response.setHeader("Pragma", "public");
    response.cacheFor("360d");
    render();
  }

}
