//flatten
/*

Example: 
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)

*/

object P07 {

	//ugly flatten
	def flatten (ls : List[Any]) : List[Any] = ls match {
	
		case head :: Nil  => head match {
			case l:List[_] => flatten(l) 
			case _ => List(head)
		}
		case head :: tail => head match {
			case l:List[_] => flatten(l) ::: flatten(tail)
			case _ => List(head) ::: flatten(tail)
		}
		
		case Nil => Nil
		 
	}

	//using flatmap 
	def flatten2 (ls : List[Any]) : List[Any] = ls flatMap {
		case l:List[_] => flatten2(l)
		case x         => List(x)
	}
		

}


var ls = List(List(1, 1), 2, List(3, List(5, 8)))
//var ls = List(List(1,1),3,List(2,2))
println("flat list from " + ls + " is " + P07.flatten2(ls))