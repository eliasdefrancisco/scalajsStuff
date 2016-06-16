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
    jQuery("body").append("<p>You clicked the button!</p>")
  }

  def setupUI(): Unit = {

    val body = jQuery("body")
      .append("<h1>Mr.Scalajs is comming!</h1>")

    val nav = jQuery("""<div></div>""")
      .appendTo(body)
      .css("background-color","rgb(200,200,200)")
      .css("overflow","hidden")

    jQuery("""<div><button type="button">Click me hard!</button></div>""")
      .click(addClickedMessage _)
      .appendTo(nav)

    jQuery("""<div><button type="button">Linking other object</button></div>""")
      .click(MiApp1.hello _)
      .appendTo(nav)

    jQuery("""<div><button type="button">Link & ResetUI</button></div>""")
      .click(MiApp1.hello2 _)
      .appendTo(nav)

    jQuery("div div")
      .css("padding","3")
      .css("float","left")

  }

}

