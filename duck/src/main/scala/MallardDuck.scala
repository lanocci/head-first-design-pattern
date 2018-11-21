package duck

class MallardDuck extends Duck {
  var flyBehavior = new FlyWithWings
  var quackBehavior = new Quack
  val display: Unit = println("genuine mallard duck")
}
