package sorting

object Sorting {
  def sort[T](lst: Seq[T], lt: (T, T) => Int): Seq[T]
    = lst.sortWith((x,y) => lt(x,y) < 0) 
}

