package apptest;


import apptest.JsonModel.Weather;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@Slf4j
@RestController
public class WeatherRestController {
    private WeatherManiuplate getterWeather;
    private WeatherRepository repository;

    @Autowired
    WeatherRestController(WeatherManiuplate manp, WeatherRepository rep){
        this.getterWeather = manp;
        this.repository = rep;
    }

    @GetMapping("/greeting")
    Weather returnWeather() throws IOException {
        Weather obj = getterWeather.parser(getterWeather.downloadSmth());
        repository.save(obj);
        return obj;
    }


}
