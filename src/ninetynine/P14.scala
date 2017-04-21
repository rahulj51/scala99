package ninetynine

/**
  * Created by rahuljai on 4/19/17.
  */
object P14 { //ab,c,d === aabbccdd

  def duplicate[A](l: List[A]): List[A] = {
    l.flatMap(e => List(e, e))
  }

  def main(args: Array[String]): Unit = {
    println(P14.duplicate(List(1,2,3)))
  }
}
