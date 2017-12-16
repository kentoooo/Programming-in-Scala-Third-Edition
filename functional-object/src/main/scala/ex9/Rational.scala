package ex9

class Rational(n:Int,d:Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this (n,1)

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  private def gcd(a: Int,b :Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

}

object ex9 extends App {
  val x = new Rational(66,42)
  val y = new Rational(77,22)
  println(x + y)
  println(x * y)
}
