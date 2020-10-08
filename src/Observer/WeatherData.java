package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private double temperature;
    private double humidity;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }
}
