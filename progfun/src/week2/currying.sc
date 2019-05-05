object currying {
//  def sum(f: Int => Int) = {
//    def sumF(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumF(a + 1, b)
//
//    sumF _
//  }
//  def sumInts = sum(x => x)
//  sumInts(2, 5)
// Shorter syntax
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  sum(x => x * x * x)(1, 30)

}


