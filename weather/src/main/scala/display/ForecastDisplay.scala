import java.util.{Observer, Observable}

class ForecastDisplay(val observable: Observable) extends Observer with DisplayElement {
  private var currentPressuer: Float = 29.92f
  private var lastPressure: Float = 29.90f
  def update(observable: Observable, arg: AnyRef): Unit {
    lastPressure = currentPressure
    currentPressure = weatherData.getPressure()
    display()
  }
  def display(): Unit {
    printf ("予想最高気温は...")
  }
}

object ForecastDisplay {
  def apply(observable: Observable){
    observable.match {
      case WeatherData => observable.addObserver(this)
    }
  }
}

