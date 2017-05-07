/**
  * Created by nottan on 2017-04-18.
  */

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HigherOrderFuncs {
  def main(args: Array[String]): Unit = {

    val log10Func = log10 _
    println(log10Func(1000))

 /* List(1000.0, 1000000.0).map(log10Func).foreach(println)
    List(1,2,3,4,5).map((x: Int) => x * 2).foreach(println)
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)
    */

    def times3(num : Int) = num * 3
    def times4(num : Int) = num * 4

    def multIt(func : (Int) => Double, num : Int) = {
      func(num)
    }

    println(multIt(times4, 3))


    // Closure
    val divisorVal = 5
    val divisor5 = (num : Double) => num / divisorVal

    println(divisor5(10))

  }
}
