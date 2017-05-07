/**
  * Created by nottan on 2017-05-06.
  */
object twitter_tut_3 {
  def main(args: Array[String]): Unit = {
    println(john.paket.exempel.kulor.BLUE)

   val times = 1

    times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }

   def getTimes(num : Int):String = {
      num match {
        case 1 => "one"
        case 2 => "two"
        case _ => "some other"
      }
    }

    def bigger(o : Any): Any = {
      o match {
        case i: Int if i < 0 => i - 1
        case i: Int => i + 1
        case i: String => "A string!"
        case _ => "something else"
      }
    }

    println(bigger(2.0))
    println(bigger(2))
    println(bigger(-2))
    println(bigger("2.0"))

    trait Something {
      val size : Int
      val brand : String
    }

    case class Calculator(val brand : String, val model : String) extends Something {
      val size = 10
      def color() = brand match {
        case "Texas" => "Blue"
        case "HP" => "Red"
      }
      def add(num1 : Int, num2 : Int): Int = num1 + num2
      def sub(num1 : Int, num2 : Int): Int = num1 - num2
    }

    class ScientificCalculator(brand : String, model : String) extends Calculator(brand, model) {
      def mult(num1 : Int, num2 : Int): Int = num1 * num2
    }

    def calcType(calc: Calculator) = calc match {
      case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
      case _ if calc.brand == "HP" && calc.model == "40B" => "scientific"
      case _ if calc.brand == "HP" && calc.model == "60T" => "business"
      case _ => "unknown"
    }

    val testare = new Calculator("HP", "20B")
    val provare = new Calculator("HP", "20B")
    println(calcType(testare))

    def newCalcType(calc: Calculator) = calc match {
      case Calculator("HP", "20B") => "financial"
      case Calculator("HP", "40B") => "financial"
      case Calculator("HP", "60T") => "financial"
      case Calculator(someBrand, someModel) => "Calculator is of model %s and brand %s".format(someBrand, someModel)
    }

    val kalle = Calculator("Texas", "40")

    println(newCalcType(kalle))

  }
}
