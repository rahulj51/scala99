object P04 {

	def length[A](ls: List[A], ln:Int=0) : Int = ls match {
		case head :: Nil => ln + 1
		case _ :: tail   => length(tail,ln+1)
		case _         => throw new NoSuchElementException
	
	}


}

var ls = List(1, 1, 2, 3, 5, 8)
println("length of list " + ls + " is " + P04.length(ls))
