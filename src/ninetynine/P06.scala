package ninetynine

/**
  * Created by rahuljai on 4/20/17.
  */
object P06 {

  def palindrome[A](l: List[A]): Boolean = {
    if (l.length <= 1) return true

    l.head == l.last && palindrome(l.tail.init)


  }

  def main(args: Array[String]): Unit = {
    println(P06.palindrome(List(1,2,3,3,2,1)))
  }
}
