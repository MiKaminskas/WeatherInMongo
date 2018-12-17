package apptest.JsonModel;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "WeatherCities")
@Data
public class Weather {
    @Id
    private long id;
    private String name;

    private String lon;
    private String lat;

    private String country;
    private int population;
    private List<Day> days;


    //private String temp;

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        out.append(Long.toString(id))
                .append(" ")
                .append(name)
                .append(" ")
                .append(lat)
                .append(" ")
                .append(lon)
                .append(" ")
                .append(country)
                .append(" ")
                .append(Integer.toString(population))
                .append(" ")
                .append(days.toString())
                .append(" ")
                /*.append(temp)*/;
        return out.toString();
    }
}
