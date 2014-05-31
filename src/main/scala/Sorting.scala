package algo

object Sorting {
  def sort[T](lst: Seq[T], compare: (T, T) => Int): Seq[T] = 
    lst.sortWith((x,y) => compare(x,y) < 0) 

  def isSorted[T](lst: Seq[T], compare: (T, T) => Int): Boolean =
    lst match {
      case Nil => true
      case _ :: Nil => true
      case h1 :: h2 :: tail => (compare(h1, h2) < 0) && isSorted(tail, compare)
    }
}

