
/**
  * Created by nottan on 2017-05-07.
  */
object twitter_tut_4 {
  def main(args: Array[String]):Unit = {
    def f(s: String) = "f(" + s + ")"
    def g(s: String) = "g(" + s + ")"

    println(f("test"))
    println(f(g("test")))

    val fComposeG = f _ compose g _

    println(fComposeG("yay"))

    val one: PartialFunction[Int, String] = { case 1 => "one"}
    val two: PartialFunction[Int, String] = { case 2 => "two"}
    val three: PartialFunction[Int, String] = { case 3 => "three"}
    val wildcard: PartialFunction[Int, String] = { case _ => "something"}

    val partial = one orElse two orElse three orElse wildcard

    println(partial(5))

    println(1 :: 2 :: 3 :: 4 :: "5" :: Nil)


    implicit def strToInt(x: String) = x.toInt

    class Container[A <% Int] {
      def addIt(x: A) = 123 + x
    }

    println((new Container[String]).addIt("123"))

  }
}
