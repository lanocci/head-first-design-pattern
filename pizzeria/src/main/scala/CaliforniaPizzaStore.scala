package pizza

class CaliforniaPizzaStore extends PizzaStore {
  def createPizza(type: String) = {
    type match {
      case "cheese" => new CaliforniaStyleCheesePizza
      case "vaggie" => new CaliforniaStyleVeggiePizza
      case "clam" => new CaliforniaStyleClamPizza
      case "pepperoni" => new CaliforniaStylePepperoniPizza
      case _ => null
    }
  }
}
