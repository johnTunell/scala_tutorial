/**
  * Created by nottan on 2017-04-18.
  */

object Classes {
  def main(args: Array[String]): Unit = {

    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s", rover.getName, rover.getSound)
    println()
    val whiskers = new Animal("Catis", "Mjau")

    println(whiskers.toString)

    println(s"${whiskers.getName} says ${whiskers.getSound}")

    val dogger = new Dog("Spike", "woof", "grr")

    println(dogger.toString())

    val fang = new Wolf("Fang")

    println(fang.move)


  }

  class Animal(var name: String, var sound: String) {
    this.setName(name)

    val id = Animal.newIdNum

    def getName() : String = name
    def getSound() : String = sound

    def setName(name : String){
      if(!(name.matches(".*\\d")))
        this.name = name
      else
        this.name = "No Name"
    }

    def setSound(sound : String): Unit ={
      this.sound = sound
    }


    def this(name : String) {
      this("No Name", "No Sound")
      this.setName(name)
    }

    def this(){
      this("No Name", "No Sound")
    }

    override def toString() : String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }
  }

  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber}
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this(name: String) {
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this() {
      this("No Name", "No Sound", "No Growl")
    }

    override def toString() : String = {
      return "%s with the id %d says %s with the growl %s".format(this.name, this.id, this.sound, this.growl)
    }

  }

  abstract class Mammal(val name: String){
    var moveSpeed : Double

    def move : String
  }

  class Wolf(name : String) extends Mammal(name){
    var moveSpeed = 35.0
    def move = "running hard..."
  }

}
