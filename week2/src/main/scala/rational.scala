class Rational(x: Int, y: Int) {
  private def gcd(x: Int, y: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g
}
