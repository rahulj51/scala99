object P02 {

  def penultimate[A](ls: List[A]) : A = ls match {
	case head :: _ :: Nil => head
	case _ :: tail   => penultimate(tail)
	case _           => throw new NoSuchElementException
  
  }  
}

var penultimate = P02.penultimate(List(1, 1, 2, 3, 5, 8))
println("Last but one element of (1, 1, 2, 3, 5, 8) is " + penultimate)
