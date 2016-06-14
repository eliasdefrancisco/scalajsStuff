package tutorial.webapp

/**
 * Created by elias on 6/13/16.
 */

import scala.scalajs.js.JSApp
//import org.scalajs.dom
//import dom.document
//import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {

//  def main(): Unit = {
//    println("Hello Kitty!")
//  }

  def main(): Unit = {
//    appendPar(document.body, "Mr.Scalajs is comming!!")
//    jQuery("body").append("<p>Mr.Scalajs is comming!!</p>")
    jQuery(setupUI _)
  }

//  def appendPar(targetNode: dom.Node, text: String): Unit = {
//    val parNode = document.createElement("p")
//    val textNode = document.createTextNode(text)
//    parNode.appendChild(textNode)
//    targetNode.appendChild(parNode)
//  }

//  @JSExport
  def addClickedMessage(): Unit = {
//    appendPar(document.body, "You clicked the button, didn't you?")
    jQuery("body").append("<p>You clicked the button!")
  }

  def setupUI(): Unit = {
//    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("""<button type="button">Click me hard!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))

    jQuery("body").append("<p>Mr.Scalajs is comming!</p>")


  }



}

