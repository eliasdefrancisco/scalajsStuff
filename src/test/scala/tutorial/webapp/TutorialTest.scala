package tutorial.webapp

/**
 * Created by elias on 6/14/16.
 */

import utest._
import org.scalajs.jquery.jQuery

object TutorialTest extends TestSuite {

  TutorialApp.setupUI()

  def tests = TestSuite {

    'HelloWord {
      assert(jQuery("h1:contains('Mr.Scalajs is comming!')").length == 1)
    }

    'ButtonClick {
      def messageCount = jQuery("p:contains('You clicked the button!')").length
      val button = jQuery("button:contains('Click me hard!')")
      assert(button.length == 1)
      assert(messageCount == 0)
      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }

  }

}
