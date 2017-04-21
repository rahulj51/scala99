object P01 {
  def lastBuiltin[A](ls: List[A]): A = ls.last

  def lastRecursive[A](ls: List[A]): A = ls match {
    case head :: Nil  => head
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

var last = P01.lastBuiltin(List(1, 1, 2, 3, 5, 8))
println("Last element of (1, 1, 2, 3, 5, 8) using builtin function is " + last)
last = P01.lastRecursive(List(1, 1, 2, 3, 5, 8))
println("Last element of (1, 1, 2, 3, 5, 8) using recursive logic is " + last) 