/*
P08 (**) Eliminate consecutive duplicates of list elements. 
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed. 
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*/

object P08 {

	def compress[A] (ls : List[A]) : List[A] = ls match {
		
		case Nil       => Nil
		case h :: tail => h :: compress(tail.dropWhile(_ == h))  //note the use of dropwhile. also note how :: has been used on the RHS. "::" is the cons operator - prepends an element to a list 
	}


}

println("could not solve!!")
val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
println(ls)
println(P08.compress(ls))