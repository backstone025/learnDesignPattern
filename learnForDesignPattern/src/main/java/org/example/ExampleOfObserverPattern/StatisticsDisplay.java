package org.example.ExampleOfObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float avarageTemp = temperature + humidity * 0.05f - pressure * 0.01f;
        float maxTemp = temperature + (8f - humidity * 0.01f - pressure * 0.003f);
        float minTemp = temperature - (15f - humidity * 0.02f + pressure * 0.005f);

        System.out.println("평균/최고/최저 온도 = " + avarageTemp + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
