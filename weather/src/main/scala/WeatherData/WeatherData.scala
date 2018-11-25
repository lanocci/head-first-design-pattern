package weather

import java.util.{Observable, Observer}

class WeatherData extends Observable {
  private var temparature: Float = 0.0f
  private var humidity: Float = 0.0f
  private var pressure: Float = 0.0f

  def measurementChanged(): Unit = {
    setChanged()
    notifyObservers()
  }

  def updateMeasurements(temparature: Float, humidity: Float, pressure: Float): Unit = {
    this.temparature = temparature
    this.humidity = humidity
    this.pressure = pressure
    measurementChanged()
  }

  def getTemparature(): Float = temparature
  def getHumidity(): Float = humidity
  def getPressure(): Float = pressure
}
