package duck

class ModelDuck extends Duck {
  var flyBehavior = new FlyNoWay
  var quackBehavior = new MuteQuack
  def display: Unit = println("Model Duck")
}
