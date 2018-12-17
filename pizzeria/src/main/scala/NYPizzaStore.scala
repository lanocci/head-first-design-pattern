package pizza

class NYPizzaStore extends PizzaStore {
  def createPizza(type: String) = {
    type match {
      case "cheese" => new NYStyleCheesePizza
      case "vaggie" => new NYStyleVeggiePizza
      case "clam" => new NYStyleClamPizza
      case "pepperoni" => new NYStylePepperoniPizza
      case _ => null
    }
  }
}
