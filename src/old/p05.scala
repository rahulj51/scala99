//reverse a list

object P05 {

	def reverse[A](ls : List[A]) : List[A] = ls match {
	
		case Nil       => Nil
		case head :: tail => reverse(tail) ::: List(head) 
	
	}
	
}

var ls = List(1, 1, 2, 3, 5, 8)
println("reverse of list " + ls + " is " + P05.reverse(ls))
