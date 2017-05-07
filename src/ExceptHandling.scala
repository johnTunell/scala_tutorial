/**
  * Created by nottan on 2017-04-18.
  */

import scala.math._

object ExceptHandling {
  def main(args: Array[String]): Unit = {

    def divideNums(num1 : Int, num2 : Int) = try
    {
      (num1 / num2)
    } catch {
      case ex : java.lang.ArithmeticException => "Ooops! Cant divide by zero"
    } finally {
      // clean up after exception
    }

    println("3 / 0 = " + divideNums(3,0))

  }
}
