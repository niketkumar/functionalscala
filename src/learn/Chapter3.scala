package learn

object Chapter3 {
  def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B =
    l match {
      case Nil => z
      case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
    }

  def foldRight[A, B](l: List[A], z: B)(f: (A, B) => B): B =
    l match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sumLeft(l: List[Int]): Int = foldLeft(l, 0)(_ + _)

  def sumRight(l: List[Int]): Int = foldRight(l, 0)(_ + _)

  def productLeft(l: List[Int]): Int = foldLeft(l, 1)(_ * _)

  def productRight(l: List[Int]): Int = foldRight(l, 1)(_ * _)

  def lengthLeft[A](l: List[A]): Int = foldLeft(l, 0)((b, _) => 1 + b)

  def lengthRight[A](l: List[A]): Int = foldRight(l, 0)((_, b) => 1 + b)

  def reverse[A](l: List[A]): List[A] = foldLeft(l, Nil: List[A])((b, a) => Cons(a, b))
}