import scala.collection.mutable.ArrayBuffer

/**
  * Created by nottan on 2017-04-19.
  */
object twitter_tut_1 {
  def main(args: Array[String]): Unit = {



   def hello(text : String) = println("hej du " + text)

    hello("john")

    trait runner {
      val runningSpeed : Int = 30
      val maxPulse : Int = 193
    }

    class Person (name : String, age : Int) extends runner {

      def getAge() = age
      def getName() = name
      def sayHello() = print(s"Hello, my name $name")
    }



    val john = new Person("John", 29)

    john.sayHello()
    println(john.runningSpeed)

    val anArray = Array(1,2,3,4)
    val arrBuf = ArrayBuffer[String]()
    val notBuf = ArrayBuffer()

    object PersonMaker {
      def apply() = new Person("Johnny", 20)
    }

    //notBuf.insert(0, 0)
    //arrBuf.insert("hej")
    println(PersonMaker().sayHello)
    arrBuf.append("testar")
    arrBuf.append("testar")
    arrBuf.append("testar")
    arrBuf.append("testar")
    println(arrBuf.last)

    println(notBuf)
    println(arrBuf)
    println(anArray)

  }
}


