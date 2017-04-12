package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def pascalCalculate(c: Int, r: Int, total: Int) = {
        if (c === 0) 1
        if c < 0 0
        if (c === r) 1

        pascalCalculate()
      }
    }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
