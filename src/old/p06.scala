//is palindrome ?

object P06 {

	def reverse[A](ls : List[A]) : List[A] = ls match {
	
		case Nil       => Nil
		case head :: tail => reverse(tail) ::: List(head) 
	
	}
	
	def isPalindrome[A](ls: List[A]) : Boolean = ls == reverse(ls)
	
}

var ls = List(1, 1, 2, 3, 5, 8)
println("reverse of list " + ls + " is " + P06.reverse(ls))
println("is list a palindrome " + P06.isPalindrome(ls))
println("")
ls = List(1, 2,3,2,1)
println("reverse of list " + ls + " is " + P06.reverse(ls))
println("is list a palindrome " + P06.isPalindrome(ls))
