/**
  * Created by nottan on 2017-05-06.
  */
object data_structures {
  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 4, 5)
    println(numbers(3))

    val aList = List(1, 2, 3, 4)

    val aTuple = ("localhost", 5000)
    println(aTuple)


    val something = aTuple match {
      case ("localhost", port) => "homeport"
      case (host, port) => "external"
    }

    println(something)


    val aMap = Map("John" -> 29, "Therese" -> "hej", 2 -> "kalle")

    println(aMap)
    println(aMap(2))

    trait Option[T] {
      def isDefined: Boolean

      def get: T

      def getOrElse(t: T): T
    }

    val numb = Map("one" -> 1, "two" -> 2)
    println(numb.get("one").get)

    val prov = numb.get("three") match {
      case Some(n) => n * 3
      case None => 0
    }

    println(prov)
    println(numb.get("three").getOrElse(2))

    def squared(num: Int): Int = num * num

    val enLista = List(1, 2, 3, 4) map squared

    println(enLista)

    def timesTwo(num: Int): Int = num * 2

    println(aList.map((x: Int) => x * 2))
    println(aList.map(timesTwo))

    println(aList.foreach((x: Int) => println(x * 2)))
    println(aList.filter((x) => x % 2 == 0))

    val firstList = List(1, 2, 3)
    val secondList = List("a", "b", "c")

    println(firstList.zip(secondList))

    def isEven(num: Int): Boolean = num % 2 == 0

    val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numbers.partition(isEven))
    println(numbers.find(i => i == 12))
    println(nums.drop(6))

    // m is the accumulator, n is the current element
    println(nums.foldLeft(0)((acc: Int, elem: Int) => acc + elem))

    println(List(firstList, secondList).flatten)

    val nestedNumbers = List(List(1, 2), List(3, 4))

    nestedNumbers.flatMap(x => x.map(_ * 2))


    def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
      numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
        fn(x) :: xs
      }
    }

    val testList = List(1,2,3,4)

    println(ourMap(testList, timesTwo(_)))

    aMap.foreach(x => println(x))
    aMap.foreach({case (x, y) => println(x)})
  }
}
