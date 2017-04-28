package ninetynine

/**
  * Created by rahuljai on 4/27/17.
  *
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
object P20 {

  def removeAt[A](k:Int, l:List[A]):(List[A],A) = l match {
    case Nil => (Nil, Nil.asInstanceOf[A])
    case _   => (l.take(k) ::: l.drop(k).tail, l.drop(k).head)
  }

  def removeAt_2[A](k:Int, l:List[A]):(List[A],A) = l.splitAt(k) match {

    case (Nil, _) if k < 0 => throw new NoSuchElementException
    case (pre, e::post) => (pre ::: post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

}
