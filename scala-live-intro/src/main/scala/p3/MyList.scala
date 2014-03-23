package p3

abstract class MyList
case class Cons(head: Int, tail: MyList) extends MyList
case object Nil extends MyList