package p4

trait Bird {
  def fly: String = "I'm flying!"
}

trait Swimmer {
  def swim: String = "I'm swimming!"
}

class Fish extends Swimmer

class Duck extends Bird with Swimmer