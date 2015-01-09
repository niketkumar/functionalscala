object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  import learn._

  val l = Cons(5, Cons(1, Nil))                   //> l  : learn.Cons[Int] = Cons(5,Cons(1,Nil))
  Chapter3.foldLeft(l, 0)(_ + _)                  //> res0: Int = 6

  Chapter3.foldRight(l, 0)(_ + _)                 //> res1: Int = 6

  Chapter3.sumLeft(l)                             //> res2: Int = 6
  Chapter3.sumRight(l)                            //> res3: Int = 6

  Chapter3.productLeft(l)                         //> res4: Int = 5
  Chapter3.productRight(l)                        //> res5: Int = 5

  Chapter3.lengthLeft(l)                          //> res6: Int = 2
  Chapter3.lengthRight(l)                         //> res7: Int = 2

  Chapter3.reverse(List(1, 2, 3))                 //> res8: learn.List[Int] = Cons(3,Cons(2,Cons(1,Nil)))
}