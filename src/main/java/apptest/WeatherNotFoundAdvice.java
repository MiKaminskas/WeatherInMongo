package apptest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class WeatherNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(WeatherNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String weatherNotFoundHandler(WeatherNotFoundException ex){
        return ex.getMessage();
    }
}
