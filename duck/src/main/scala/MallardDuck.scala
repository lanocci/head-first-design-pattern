package duck

class MallardDuck extends Duck {
  val flyBehavior: FlyBehavior = new FlyWithWings()
  val quackBehavior: QuackBehavior = new Quack()
  val display: Unit = println("genuine mallard duck")
}
