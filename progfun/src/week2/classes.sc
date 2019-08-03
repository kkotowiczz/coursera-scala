

object classes {
  class Rational(val x: Int, val y: Int) {
    def numer = x
    def denom = y

    override def toString: String = s"$x / $y"

    def add(that: Rational) =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def neg: Rational = new Rational(-numer, denom)

    def sub(that: Rational) = add(that.neg)
  }

  val x = new Rational(1, 2)
  x.numer
  x.denom

  val y = new Rational(2, 3)
  x.add(y)

  val x1 = new Rational(1, 3)
  val y1 = new Rational(5, 7)
  val z1 = new Rational(3, 2)

  x1.sub(y1).sub(z1)
}