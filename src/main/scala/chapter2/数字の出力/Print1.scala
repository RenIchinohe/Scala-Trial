package chapter2.数字の出力

object Print1 {

  /*
  変数iterationに1から10までの数字を代入し、
  println()に変数iを設定して実行することで1から10までの数字を出力します。
   */

  def main(args: Array[String]): Unit = {
    for {iteration <- 1 to 10}
      println(iteration)
  }
}
