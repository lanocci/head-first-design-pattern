package duck

import collection.mutable.Stack
import org.scalatest._

class DuckTest extends FlatSpec with Matchers {
  val mallard = new MallardDuck
  "Mallard Duck" should "Able to fly" in {
    mallard.performFly() should be (true)
  }
  "Mallard Duck" should "Quack" in {
    mallard.performQuack() should be ("quack")
  }

  val model = new ModelDuck
  "Model Duck should not perform fly" in {
    model.performFly() should be (false)
  }
  "Model Duck should fly with rocket" in {
    model.setFlyBehavior(new FlyRocketPowered)
    model.performFly() should be (true)
  }
}
