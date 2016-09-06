import com.github.marklister.collections.io._
import com.github.marklister.collections._
import java.io._

object ReadCSV {
  def main(args: Array[String])  {
    println("Hi! Put your 'sample.csv' in the start directory. I read it from there.\nUse vi -b (binary mode to edit. Values should be separated with ';'.")

    val f = CsvParser[String,String].parse(new java.io.FileReader("sample.csv"), ";")
    println(f)
  }

}