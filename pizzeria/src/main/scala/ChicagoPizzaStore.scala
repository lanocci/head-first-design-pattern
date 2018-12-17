package pizza

class ChicagoPizzaStore extends PizzaStore {
  def createPizza(type: String) = {
    type match {
      case "cheese" => new ChicagoStyleCheesePizza
      case "vaggie" => new ChicagoStyleVeggiePizza
      case "clam" => new ChicagoStyleClamPizza
      case "pepperoni" => new ChicagoStylePepperoniPizza
      case _ => null
    }
  }
}
