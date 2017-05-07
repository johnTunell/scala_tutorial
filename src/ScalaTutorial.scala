/**
  * Created by nottan on 2017-04-18.
  */
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main(args: Array[String]): Unit = {

    val favNums = new Array[Int](20)

    val friends = Array("Bob", "tTom")

    friends(0) = "therese"

    println(friends(0))

    val friends2 = ArrayBuffer[String]()

    friends2.insert(0, "Pelle")

    friends2 += "Mark"

    friends2 ++= Array("Susy", "Paul")

    friends2.insert(1, "Kalle")


    for(friend <- friends2)
      println(friend)

    for(j <- 0 to (favNums.length-1))
      favNums(j) = j

    val favNumsTimes2 = for(num <- favNums) yield 2 * num

    var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num

    favNumsDiv4.foreach(println)

    var multTable = Array.ofDim[Int](10,10)

    for(i <- 0 to 9)
      for(j <- 0 to 9)
        multTable(i)(j) = i * j

    for(i <- 0 to 9)
      for(j <- 0 to 9)
        //printf("%d : %d = %d\n", i, j, multTable(i)(j) )


    println("Sum : " + favNums.sum)
    println("Max : " + favNums.max)
    println("Min : " + favNums.min)

    val sortedNums = favNums.sortWith(_>_)

    println(sortedNums.deep.mkString(", "))



  }
}
