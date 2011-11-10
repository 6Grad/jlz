package controllers;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

import play.mvc.Controller;

/**
 * Facebook Application. width: 760px.
 */

public class App extends Controller {

  /* entry */
  public static void index() {
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
