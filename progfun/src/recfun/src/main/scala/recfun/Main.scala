package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 38) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    print(balance("())(".toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def parenCounter(char: Char) = if(char == ')') 1 else if(char == '(') -1 else 0

      def checkIfParensClosed() = chars.lastIndexOf(')') > chars.lastIndexOf('(')

      def occurrences(chars: List[Char], acc: Int): Int = {
        if (chars.isEmpty) acc
        else occurrences(chars.tail, acc + parenCounter(chars.head))
      }

      occurrences(chars, 0) == 0 && checkIfParensClosed()
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
