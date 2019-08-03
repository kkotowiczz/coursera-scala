

object classes {
  class Rational(val x: Int, val y: Int) {
    require(y != 0, "denominator must be nonzero")

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    def this(x: Int) = this(x, 1)
    def numer = x / g
    def denom = y / g

    def < (that: Rational) = numer * that.denom < that.numer * denom

    def max(that: Rational) = if(this < that) that else this

    override def toString: String = s"$x / $y"

    def + (that: Rational) =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def unary_- : Rational = new Rational(-numer, denom)

    def - (that: Rational) = this + -that
  }

  val x = new Rational(1, 2)
  x.numer
  x.denom

  val y = new Rational(2, 3)
  x.add(y)

  val x1 = new Rational(1, 3)
  val y1 = new Rational(5, 7)
  val z1 = new Rational(3, 2)

  x1 - y1 - z1

  x < y
  x1 max y1
}