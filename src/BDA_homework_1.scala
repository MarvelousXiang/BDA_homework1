import scala.io.Source
object BDA_homework_1 {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("C:\\Users\\10072\\Downloads\\test.txt","UTF-8")
    var map = Map.empty[String, Int]
    for (line <- file.getLines){
      val words = line.split(" ").map(_.toLowerCase()).toList
      for (word <- words){
        if (map.contains(word))
          map += (word -> (map(word)+1))
        else
          map += (word -> 1)
      }
    }
    println("ResultMap:" + map)
    file.close()
  }
}
