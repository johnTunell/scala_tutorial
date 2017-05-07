/**
  * Created by nottan on 2017-04-18.
  */
import scala.collection.mutable.ArrayBuffer

object Maps {
  def main(args: Array[String]): Unit = {

    val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

    if(employees.contains("Manager"))
      printf("Manger : %s\n", employees("Manager"))

    val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Sally")

    println(customers(100))
    customers(100) = "John"
    println(customers(100))

    for((k,v) <- customers) {
      println(k)
      println(v)
    }
  }
}
