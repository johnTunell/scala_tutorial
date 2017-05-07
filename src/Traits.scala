/**
  * Created by nottan on 2017-04-18.
  */

object Traits {
  def main(args: Array[String]): Unit = {

    val superman = new SuperHero("Superman")
    println(superman.hitByBullet)
    println(superman.fly)
    println(superman.ricochet(10))

  }

  trait Flyable {
    def fly : String
  }

  trait BulletProof{
    def hitByBullet : String

    def ricochet(startSpeed : Double) : String = {
      "The bullet will ricochet at a speed of %.1f ft/sec".format(startSpeed * 0.75)
    }
  }

  class SuperHero(val name : String) extends Flyable with BulletProof {
    def fly = "%s flys through the air".format(this.name)
    def hitByBullet = "%s got hit by a bullet".format(this.name)
  }

}
