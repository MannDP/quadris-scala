import org.rogach.scallop._

class Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  val bonus: ScallopOption[Boolean] = opt[Boolean](default = Some(false))
  val textonly: ScallopOption[Boolean] = opt[Boolean](default = Some(false))
  val seed: ScallopOption[Int] = opt[Int](default = Some(0))
  val startlevel: ScallopOption[Int] = opt[Int](default = Some(0))
  val scriptfile: ScallopOption[String] = opt[String](default = Some("sequence.txt"))
  verify()
}

object Main {
  def main(args: Array[String]): Unit = {
    val conf = new Conf(args)
  }
}
