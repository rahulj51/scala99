package ninetynine

/**
  * Created by rahuljai on 4/18/17.
  */
object P02 {

  def penultimate[A](list: List[A]): A = list match {
    case (x::y::Nil) => list.head
    case (x::xs) => penultimate(xs)
  }

}
