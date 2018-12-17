package pizza

class SimplePizzaFactory() {
  def createPizza(type: String): Pizza = {
    val pizza = type match {
      case "chees" => new CheesePizza()
      case "pepperoni" => new PepperoniPizza()
      case "clam" => new ClamPizza()
      case "veggie" => new VeggiePizza()
    }
  }
}
