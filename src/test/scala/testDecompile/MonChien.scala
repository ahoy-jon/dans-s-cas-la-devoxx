package testDecompile

case class MonChien(nom: String, race: String) // par défaut les paramètres sont des 'val'


object MonChien {
  val d1 = MonChien("Scooby", "Doberman")
  val d2 = MonChien("Rex", "Custom")
  val d3 = new MonChien("Scooby", "Doberman") // Cela marche aussi avec new, mais on peut s'en passer !
  val d4 = MonChien.apply("Rex", "Custom") // utilisation de la méthode apply
}

object Prg {
  def main(args: Array[String]): Unit = {
    println("Hello")
  }
}
