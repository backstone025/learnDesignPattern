package org.example;

import org.example.ExampleOfObserverPattern.CurrentConditionDisplay;
import org.example.ExampleOfObserverPattern.ForecastDisplay;
import org.example.ExampleOfObserverPattern.StatisticsDisplay;
import org.example.ExampleOfObserverPattern.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMesurements(80, 65, 30.4f);
        weatherData.setMesurements(82, 70, 29.2f);
        weatherData.setMesurements(78,90,29.2f);
    }
}