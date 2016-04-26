package joelabs.nashorn

import javax.script.{Invocable, ScriptEngine, ScriptEngineManager}
import scala.collection.JavaConversions._

object NashornDemo extends App {
  val sem = new ScriptEngineManager
  val engine: ScriptEngine = sem.getEngineByName("nashorn")
  val invocable: Invocable = engine.asInstanceOf[Invocable]

  // The script must be loaded as follows
  engine.eval("load('classpath:joelabs/nashorn/Hello.js')")
  engine.eval("load('classpath:joelabs/nashorn/Summary.js')")

  private val result = invocable.invokeFunction("hello", "Nashorn")
  println(s"result=$result")

  private val result2 = invocable.invokeFunction("summary", new Input(List("kaka","banan")))
  println(s"result=$result2")
}
