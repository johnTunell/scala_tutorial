/**
  * Created by nottan on 2017-04-18.
  */
import java.io.PrintWriter
import scala.io.Source

import scala.collection.mutable.ArrayBuffer

object fileIo {
  def main(args: Array[String]): Unit = {

    val writer = new PrintWriter("test.txt")
    writer.write("Hello There!")
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")

    val lineIterator = textFromFile.getLines

    for(line <- lineIterator)
      println(line)

    textFromFile.close()
  }
}
