package Adapter.Weather;

public class WeatherUI {
    public void showTemperature(int zipcode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperature(63400));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(63400);
    }
}
