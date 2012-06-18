/*
If a list contains repeated elements they should be placed in separate sublists. 
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/
object P09 {

	def pack[A] (ls : List[A]) : List[List[A]] = ls match {
		
		case Nil       => Nil
		case h :: tail => (h :: tail.takeWhile(_ == h)) :: pack(tail.dropWhile(_ == h))
	}


}

val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
println(ls)
println(P09.pack(ls))

/*
Initially I tried using ::: for appending but it gave an error. 





*/