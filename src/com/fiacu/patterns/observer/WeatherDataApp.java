package com.fiacu.patterns.observer;

public class WeatherDataApp {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay curr = new CurrentConditionsDisplay(wd);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
        ForecastDisplay forecastDisplay = new ForecastDisplay(wd);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(wd);

        wd.setMeasurement(80, 65, 30.4f);
        wd.setMeasurement(82, 70, 29.2f);
        wd.setMeasurement(78, 90, 29.2f);
    }

}
