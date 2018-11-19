package duck

abstract class Duck {
  val flyBehavior: FlyBehavior
  val quackBehavior: QuackBehavior

  def display(): Unit

  def performFly(): Boolean = flyBehavior.fly()

  def performQuack(): String = quackBehavior.quack()

  def swim(): Unit = println("all the ducks can float on water")


  def setQuackBehavior: Unit = {
    quackBehavior = qb
  }
}

object Duck {
  def setFlyBehavior(fb: FlyBehavior): Unit = {
    new Duck { val flyBehavior = fb }
  }
  def setQuackBehavior(qb: QuackBehavior): Unit = {
    new Duck { val quackBehavior = qb }
  }
}
