package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

/**
 * Created by elias on 6/16/16.
 */

object MiApp1 extends JSApp {

  def main(): Unit = {}

  def hello(): Unit = {
    jQuery("<h2>MiApp1 on the air</h2>").appendTo(jQuery("body"))
//    jQuery("body").append("<h2>MiApp1 on the air</h2>")
  }

  def hello2(): Unit = {
    jQuery("body").empty()
    TutorialApp.setupUI()
  }

}
