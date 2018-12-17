package apptest;


import apptest.JsonModel.Weather;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Slf4j
@CrossOrigin(origins ="*")
@RestController
public class WeatherRestController {
    private WeatherManiuplate getterWeather;
    private WeatherRepository repository;

    @Autowired
    WeatherRestController(WeatherManiuplate manp, WeatherRepository rep){
        this.getterWeather = manp;
        this.repository = rep;
    }

    @CrossOrigin
    @GetMapping("/greeting")
    Weather returnWeather(@RequestParam(value="city", defaultValue="Vilnius") String cityName) throws IOException {
        Weather obj = getterWeather.parser(getterWeather.downloadCityJson(cityName));
        //repository.save(obj);
        return obj;
    }
}
