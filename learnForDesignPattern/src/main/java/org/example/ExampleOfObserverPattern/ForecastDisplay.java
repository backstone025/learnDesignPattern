package org.example.ExampleOfObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (temperature > 85) {
            System.out.print("덥고");
        } else if (temperature < 68) {
            System.out.print("춥고");
        } else {
            System.out.print("따뜻하고");
        }
        if (humidity > 60) {
            System.out.println(", 습하겠습니다.");
        } else if (humidity < 40) {
            System.out.println(", 건조하겠습니다.");
        } else
            System.out.println(", 쾌적하겠습니다.");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
