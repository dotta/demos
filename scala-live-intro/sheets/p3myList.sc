object p3myList {
  import p3.{ MyList, Nil, Cons }

  def length(xs: MyList): Int = xs match {
    case Nil           => 0
    case Cons(_, tail) => 1 + length(tail)
  }
  
  length(Nil)
  length(Cons(10, Nil))
  length(Cons(10, Cons(11, Nil)))
}