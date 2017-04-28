trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Con[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}

def singleton[T](elem: T) = new Con[T](elem, new Nil[T])
