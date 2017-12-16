package ex4

class Rational(n:Int,d:Int) {
  require( d != 0)
  override def toString = n + "/" + d
}

object ex4 extends App {
  println(new Rational(3,0))
}