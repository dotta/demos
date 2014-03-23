object p2collections {
  import p1.scala.Time

  println("Collections power!")

  // 1. Uncomment below and **add default arguments to class Time**
  // val times = List(Time(1), Time(2), Time(12,30), Time(16,15))
  
  // 2. Note that Scala defaults collections are immutable.
  //    Of course, you are free to use mutable data structures as well.
  
  // times.head
  // times.last
  
  // times.take(2)
  
  // times.filter(time => time.hours >= 12)
  
  // times.map(time => Time(time.hours + 1, time.minutes))
  
  // times.partition(time => time.hours >= 12)

  // times.groupBy(time => time.minutes)

}