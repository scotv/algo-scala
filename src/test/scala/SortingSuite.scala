package algo

import org.scalatest.FunSuite

class SortingSuite extends FunSuite {
  import algo.Sorting._

  private def c1 = (x: Int, y: Int) => x-y
  private def c2 = (x: Int, y: Int) => y-x

  def increase(lst: Seq[Int]) = isSorted(lst, c1)
  def decrease(lst: Seq[Int]) = isSorted(lst, c2)

  test("basic sorting via lib") {  
    assert(increase(sort(List(1, 6, 4, 5, 3), c1)))
  }
}
