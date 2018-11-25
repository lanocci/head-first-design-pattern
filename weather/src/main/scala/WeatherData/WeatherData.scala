package weather

import java.util.{Observable, Observer}

class WeatherData extends Observable {
  private var temparature: Float
  private var humidity: Float
  private var pressure: Float

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
