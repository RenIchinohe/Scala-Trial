package chapter2.数字の出力

object Print2 {

  /*
  Scalaではfor式をネストできます。
  最初のループで1から10まで繰り返しを行い、それぞれ変数firstIterationに代入します。
  2回目のループでも1から10まで繰り返しを行い、変数secondIterationに代入します。
  firstIteration * secondIterationの結果が出力されます。
   */

  def main(args: Array[String]): Unit = {
    for {firstIteration <- 1 to 10
         secondIteration <- 1 to 10}
      println(firstIteration * secondIteration)
  }
}
