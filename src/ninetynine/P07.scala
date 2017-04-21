package ninetynine

/**
  * Created by rahuljai on 4/20/17.
  */
object P07 {

  def flatten_0[A](l : List[List[A]]):List[A] = {
    //((12),(34),(56)) => (123456)
    l.foldRight(List[A]())((e, acc) => e ::: acc)
  }

  def flatten(ls:List[Any]): List[Any] = {
    //((1,2),3,(4,5),(6,(7,8))) => (1,2,3,4,5,6,7,8)
    ls.flatMap(x => x match {
      case ms:List[Any] => flatten(ms)
      case e => List(e)
    } )
  }

  def main(args: Array[String]): Unit = {
    //println(P07.flatten_0(List(List(3,4), List(1,2), List(7,9))))
    println(P07.flatten(List(List(3,4), 5, List(1,2), List(9,List(7,9)))))
  }

}
