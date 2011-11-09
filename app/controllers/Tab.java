package controllers;

import java.util.Properties;

import play.Logger;
import play.Play;
import play.mvc.Controller;

/**
 * Facebook Tab App ( 520px )
 * 
 * @author Cédric Reginster <cedric.reginster@6grad.ch>
 */
public class Tab extends Controller {

  public static void index() {
    
    String link = Play.configuration.getProperty("application.fbAppUrl");
    
    render(link);
  }

}
