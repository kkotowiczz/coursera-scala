object exercise2 {
  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)
  }

  sum((x: Int) => x * x, 5, 30)
}