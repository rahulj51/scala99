object P03 {

  def nth[A](k:Int, ls: List[A]) : A = k match {
	case 0 => ls.head
	case some if some < 0 => throw new NoSuchElementException
	case _ => nth(k-1, ls.tail)
  }  
}

var nth = P03.nth(2, List(1, 1, 2, 3, 5, 8))
println("Element on location 2 of (1, 1, 2, 3, 5, 8) is " + nth)
