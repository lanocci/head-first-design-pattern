package pizza

class PizzaStore(val factory: SimplePizzaFactory) {
  def orderPizza(type: String) = {
    val pizza: Pizza = factory.createPizza(type)
    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()
    return pizza
  }
}
