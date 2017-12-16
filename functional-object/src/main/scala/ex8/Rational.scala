package ex8

class Rational(n: Int,d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this (n,1)
  override def toString = numer + "/" + denom
  def add(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  private def gcd(a: Int,b :Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

}

object ex8 extends App {
  println(new Rational(66,42))
}