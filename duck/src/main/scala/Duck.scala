package duck

abstract class Duck{
  var flyBehavior: FlyBehavior
  var quackBehavior: QuackBehavior

  def display(): Unit

  def performFly(): Boolean = flyBehavior.fly()

  def performQuack(): String = quackBehavior.quack()

  def swim(): Unit = println("all the ducks can float on water")

  def setFlyBehavior(fb: FlyBehavior): Unit = {
    this.flyBehavior = fb
  }
  def setQuackBehavior(qb: QuackBehavior): Unit = {
    this.quackBehavior = qb
  }
}
