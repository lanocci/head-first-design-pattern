package pizza

abstract class PizzaStore {
  def orderPizza(type: String): Pizza = {
    val pizza: Pizza = createPizza(type)
    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()
    return pizza
  }
  def createPizza(type: String): Pizza
}
