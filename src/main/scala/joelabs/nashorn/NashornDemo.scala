package joelabs.nashorn

import java.io.{InputStreamReader, LineNumberReader}
import java.util.ResourceBundle
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

  val s = this.getClass.getResourceAsStream("/joelabs/nashorn/Hello.js")
  val r = new LineNumberReader(new InputStreamReader(s))
  var line: String = r.readLine()
  while (line != null) {
    println(line)
    line = r.readLine()
  }
}
