package ex3

class Rational(n: Int, d: Int) {
  override def toString = n + "/" + d
}

object ex3 extends App {
  println(new Rational(1,3))
  println(new Rational(5,7))
}