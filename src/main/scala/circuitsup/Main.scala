package circuitsup

import com.wbillingsley.veautiful.Attacher
import org.scalajs.dom

object Main {

  def main(args:Array[String]): Unit = {
    val root = Attacher.newRoot(dom.document.getElementById("render-here"))
    root.render(Router)
  }

}
