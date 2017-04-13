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
      def edge(col: Int, row: Int): Int = {
        if (col < 0) 0
        else if (col === 0) 1
        else if (col === row) 1
        else if (col > row) 0
        else col
      }


    }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def loop(chars: List[Char], open: Int, close: Int): Boolean = {
        if (chars.isEmpty) open === close
        else {
          if (chars.head === '(') loop(chars.tail, open + 1, close)
          else if (chars.head === ')') loop(chars.tail, open, close + 1)
          else loop(chars.tail, open, close)
        }
      }

      loop(chars, 0, 0)
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
