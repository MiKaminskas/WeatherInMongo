package apptest;

import apptest.JsonModel.Day;
import apptest.JsonModel.Temp;
import apptest.JsonModel.Weather;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.util.*;

@Slf4j
@Component
public class WeatherManiuplate {

    public String downloadCityJson(String city){
        //String city = "Vilnius";
        String  url = "http://api.openweathermap.org/data/2.5/forecast/daily?"/*q=Vilnius&units=metric&cnt=7&APPID=8f921e53cc37538eecf6553488ff694b"*/;

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(url)
                .queryParam("q",city)
                .queryParam("units","metric")
                .queryParam("cnt", "16")
                .queryParam("APPID","8f921e53cc37538eecf6553488ff694b");
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,entity,String.class);


        return response.getBody();
    }

    public Weather parser(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Weather weather = new Weather();
        JsonNode rootNode = objectMapper.readTree(json);
        JsonNode city = rootNode.path("city");
        weather.setId(city.path("id").asInt());
        weather.setName(city.path("name").asText());
        weather.setCountry(city.path("country").asText());
        weather.setLon((city.path("coord")).path("lon").asText());
        weather.setLat((city.path("coord")).path("lat").asText());
        JsonNode days = rootNode.path("list");
        Iterator<JsonNode> iterator = days.elements();

        List<Day> daysList = new ArrayList<>();
        while (iterator.hasNext()){
            JsonNode dayJson = iterator.next();
            Day day = new Day();

            day.setDt(dayJson.path("dt").asInt());
            Map tempMap  = new HashMap<>();
            /*tempMap = objectMapper.convertValue(dayJson.path("temp"),Map.class);
            day.setTemp(tempMap);*/
            day.setPressure(dayJson.path("dt").asInt());
            day.setHumidity(dayJson.path("humidity").asInt());
            Map weatherMap  = new HashMap<>();
            //weatherMap = objectMapper.convertValue(dayJson.path("weather"),Map.class);
            //day.setWeather(weatherMap);
            day.setSpeed(dayJson.path("speed").asInt());
            day.setDeg(dayJson.path("deg").asInt());
            day.setClouds(dayJson.path("clouds").asInt());
            JsonNode tempNode = dayJson.path("temp");
            Temp temp = new Temp();
            temp.setDay(tempNode.path("day").asDouble());
            temp.setMin(tempNode.path("min").asDouble());
            temp.setMax(tempNode.path("max").asDouble());
            temp.setNight(tempNode.path("night").asDouble());
            temp.setEve(tempNode.path("eve").asDouble());
            temp.setMorn(tempNode.path("morn").asDouble());
            day.setTemp(temp);
            daysList.add(day);
        }
        weather.setDays(daysList);
        return weather;
    }

}
