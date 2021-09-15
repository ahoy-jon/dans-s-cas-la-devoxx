package premiers_pas


import support.HandsOnSuite


/*object ProductDemo {


  case class Product(name: String)

  case class Order(id: String, products: List[Product])


  def explain(order:Order):String = ???


  def allProducts(orders: List[Order]): List[Product] =
    for {
      order <- orders
      product <- order.products
      if product.name.nonEmpty
    } yield product

  def log(message: String, level: Level = Level.Info): Unit = {
    level match {
      case Level.Info => println(message)
      case Level.Warn => println("*" * 10 + "  " + message  + "  " + "*" * 10)
    }

  }

  sealed trait Level // Level = Info | Warn
  object Level {
    case object Info extends Level
    case object Warn extends Level
    case class Custom(name: String) extends Level
  }



  def main(args: Array[String]): Unit = {
    log("hello")

    log(message = "Hello")

    log(message = "hello", level = Level.Warn)

    log(level = Level.Warn, message = "hello")

  }

}*/

/**
 * 1mn chrono ?
 */

/**
 * Les val et var sont des mots-clé utilisés en Scala pour déclarer des champs.
 * On peut rajouter le mot-clé 'private' devant pour définir des champs privés.
 * Si rien n'est spécifié, on est par défaut en 'public' en Scala.
 *
 *     - var : permet de déclarer une variable mutable (=que l'on pourra par la suite modifier si on le veut)
 *
 *     - val : permet de déclarer une variable immuable (=que l'on ne pourra plus modifier une fois initialisée)
 */
class e0_vars_vals extends HandsOnSuite {

  exercice("Les vars peuvent être réaffectées") {
    var a = 5

    a should be(5)

    a = 7

    a should be(7)
  }

  exercice("Par contre les vals sont immuables (équivalent de final Java), elles ne peuvent pas être réaffectées") {
    val a = 5

    a should be(5)

    /*
    *  Question supplémentaire :
    */
    // Que se passe-t-il lorsque l'on ajoute ces lignes ?
    // a = 7
    // a should be (7)
  }
}
