object p1ex {

  val jtime = new p1.java.Time(15, 00)
  val stime = new p1.scala.Time(15, 00)

  // Note: a. unirform syntax for calling Java and Scala code
  //       b. because of type inference the language look like a dynamic/scripting language!
  
  // 1. now let's implement toString
  
  // val t1 = new p1.scala.Time(15, 00)
  // val t2 = new p1.scala.Time(15, 00)
  // t1 == t2
  
  // 2. now let's implement equals/hashcode
}