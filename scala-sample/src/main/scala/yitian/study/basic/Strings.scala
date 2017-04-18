package yitian.study.basic

/**
  * 字符串示例
  */
object Strings {
  def main(args: Array[String]): Unit = {
    operateStrings()
  }

  /**
    * 字符串常用方法
    */
  def operateStrings(): Unit = {
    var string = "  fUck "
    println(string)
    println(string.length)
    println(string.trim)
    println(string.indexOf("u"))
    println(string.lastIndexOf(" "))
    println(string.substring(2, 7))
    println(string.toUpperCase())
    println(string.toLowerCase())
  }
}
