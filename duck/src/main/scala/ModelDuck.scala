package duck

class ModelDuck extends Duck {
  this.flyBehavior = new FlyNoWay
  this.quackBehavior = new MuteQuack
  def display: Unit = println("Model Duck")
}
