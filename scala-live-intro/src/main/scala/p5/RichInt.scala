package p5

case class RichInt(v: Int) {
  def +(c: Complex): Complex = new Complex(v + c.r, c.i)
}