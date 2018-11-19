package duck

class ModelDuck extends Duck {
  val flyBehavior = new FlyNoWay()
  val quackBehavior = new Quack()

  def display: Unit = println("Model Duck")
}
