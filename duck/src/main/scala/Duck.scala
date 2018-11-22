package duck

abstract class Duck{
  def flyBehavior: FlyBehavior
  def quackBehavior: QuackBehavior

  def display(): Unit

  def performFly(): Boolean = flyBehavior.fly()

  def performQuack(): String = quackBehavior.quack()

  def swim(): Unit = println("all the ducks can float on water")

  def setFlyBehavior(fb: FlyBehavior): Unit = {
    flyBehavior = fb
  }
  def setQuackBehavior(qb: QuackBehavior): Unit = {
    quackBehavior = qb
  }
}
