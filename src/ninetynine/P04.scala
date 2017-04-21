package ninetynine

/**
  * Created by rahuljai on 4/20/17.
  */
object P04 {

  def length[A](l : List[A]):Int = {
    l.foldLeft(0)((acc,_) => acc+1)
  }

  def main(args: Array[String]): Unit = {
    println(P04.length(List()))
  }

}
