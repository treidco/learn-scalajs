package tutorial

import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js.JSApp

object Hello extends JSApp {

  def main(): Unit = {
    appendPar(document.body, "Hello!")
  }


  def appendPar(target: dom.Node, text: String): Unit = {
    val n = document.createElement("p")
    val t = document.createTextNode(text)
    n.appendChild(t)
    target.appendChild(n)
  }

}
