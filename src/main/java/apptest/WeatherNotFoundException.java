package apptest;

public class WeatherNotFoundException extends RuntimeException {
    public WeatherNotFoundException(Long id) {
        super("Could not find Weather City" + id);
    }
}
