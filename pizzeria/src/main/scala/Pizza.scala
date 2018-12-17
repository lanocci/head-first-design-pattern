package pizza

abstract class Pizza(name: String, dough: String, sauce: String, toppings: Seq) {
  def prepare(): Unit = {
    println(s"${name}を下処理")
    println("生地をこねる")
    println("ソースを追加")
    println("トッピングを追加")
    toppings.foreach(print(s"${_} ")
  }

  def bake(): Unit = println("350度で25分間焼く")

  def cut(): Unit = println("ピザを扇型に切り分ける")

  def box(): Unit = println("PizzaStore の正式な箱に入れる")

  def getName(): String = name
}


