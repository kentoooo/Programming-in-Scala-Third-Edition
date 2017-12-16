package ex5

class Rational(n: Int,d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer + "/" + denom
  def add(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
}

object ex5 extends App {
  val one = new Rational(1,2)
  val two = new Rational(2,3)
  val three = one.add(two)
  println(one)
  println(two)
  println(three)
}