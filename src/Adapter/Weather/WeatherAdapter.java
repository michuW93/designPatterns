package Adapter.Weather;

public class WeatherAdapter {
    public int findTemperature(int zipcode){
        String city = null;

        //here most probably we would take it from db, in example hardcode is enough
        if(zipcode == 63400){
            city = "Ostrow Wielkopolski";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);
        return temperature;
    }
}
