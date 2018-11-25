package weather

import java.util.{Observer, Observable}

class ForecastDisplay(val observable: Observable, var weatherData: Option[WeatherData]) extends Observer with DisplayElement {
  private var currentPressure: Float = 29.92f
  private var lastPressure: Float = 29.90f
  def update(observable: Observable, arg: AnyRef): Unit = {
    lastPressure = currentPressure
    weatherData match {
      case _: Option[WeatherData] => {
        currentPressure = weatherData.get.getPressure()
      }
      case _ => {
        currentPressure = 0.0f
      }
    }
    display()
  }
  def display(): Unit =  {
    printf ("予想最高気温は...")
  }
}

object ForecastDisplay {
  def apply(observable: Option[Observable]) = {
    observable match {
      case _: Option[WeatherData] => {
        observable.get.addObserver(this.asInstanceOf[Observer])
        new ForecastDisplay(observable.asInstanceOf[Observable], Some(observable.get.asInstanceOf[WeatherData]))
      }
      case _ => None
    }
  }
}

