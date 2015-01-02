package learn

object Chapter2 {
  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(index: Int, acc: Boolean): Boolean = {
      if (index == as.length - 1)
        true
      else if (!acc)
        false
      else {
        if (gt(as(index + 1), as(index)))
          loop(index + 1, true)
        else
          false
      }
    }
    loop(0, true)
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = (b: B) => f(a, b)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = (a: A) => (b: B) => f(a, b)

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}