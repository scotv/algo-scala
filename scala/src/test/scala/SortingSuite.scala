package Sorting

import org.scalatest.FunSuite

class SortingSuite extends FunSuite {
  import Sorting._

  test("basic sorting via lib") {
  
    assert(sort(List(1, 6, 4, 5, 3), (x,y) => x-y) === List(1, 3, 4, 5, 6))
  }
}
