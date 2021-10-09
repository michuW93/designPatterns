package Adapter.Weather;

public class WeatherAdapter {
    public int findTemperature(int zipcode){
        String city = null;
        if(zipcode == 63400){ //here most probably we would take it from db, in example hardcode is enough
            city = "Ostrow Wielkopolski";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);
        return temperature;
    }
}
