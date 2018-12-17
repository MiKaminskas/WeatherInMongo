package apptest;

import apptest.JsonModel.Day;
import apptest.JsonModel.Weather;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@Slf4j
public class WeatherManiuplateTest {

    @Test
    public void downloadSmth() {
        WeatherManiuplate weatherManiuplate = new WeatherManiuplate();
        log.debug("everything is ok" + weatherManiuplate.downloadCityJson("Vilnius"));
    }
    @Test
    public void parseWeatherOnTestJSON() throws IOException {
        String strExample = "{\"city\":{\"id\":593116,\"name\":\"Vilnius\",\"coord\":{\"lon\":25.2829,\"lat\":54.687},\"country\":\"LT\",\"population\":542366},\"cod\":\"200\",\"message\":0.8121037,\"cnt\":16,\"list\":[{\"dt\":1538992800,\"temp\":{\"day\":5,\"min\":4.53,\"max\":5,\"night\":4.53,\"eve\":5,\"morn\":5},\"pressure\":1018.58,\"humidity\":79,\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03n\"}],\"speed\":1.31,\"deg\":152,\"clouds\":48},{\"dt\":1539079200,\"temp\":{\"day\":11.48,\"min\":3.13,\"max\":13.57,\"night\":6.79,\"eve\":12.85,\"morn\":3.13},\"pressure\":1019.17,\"humidity\":72,\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02d\"}],\"speed\":4.72,\"deg\":217,\"clouds\":12},{\"dt\":1539165600,\"temp\":{\"day\":14.04,\"min\":5.97,\"max\":17.13,\"night\":6.65,\"eve\":15.59,\"morn\":5.97},\"pressure\":1021.29,\"humidity\":74,\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02d\"}],\"speed\":4.1,\"deg\":232,\"clouds\":24},{\"dt\":1539252000,\"temp\":{\"day\":15.58,\"min\":3.61,\"max\":18.68,\"night\":7.56,\"eve\":16.12,\"morn\":3.61},\"pressure\":1025.52,\"humidity\":79,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":2.06,\"deg\":158,\"clouds\":0},{\"dt\":1539338400,\"temp\":{\"day\":16.97,\"min\":5.89,\"max\":16.97,\"night\":5.89,\"eve\":9.53,\"morn\":5.98},\"pressure\":1030.47,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":3.67,\"deg\":170,\"clouds\":0},{\"dt\":1539424800,\"temp\":{\"day\":15.58,\"min\":3.87,\"max\":15.58,\"night\":3.87,\"eve\":7.88,\"morn\":5.63},\"pressure\":1031.69,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":3.36,\"deg\":207,\"clouds\":0},{\"dt\":1539511200,\"temp\":{\"day\":16.17,\"min\":4.22,\"max\":16.17,\"night\":4.22,\"eve\":8.01,\"morn\":5.61},\"pressure\":1026.85,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":3.12,\"deg\":277,\"clouds\":8},{\"dt\":1539597600,\"temp\":{\"day\":15.76,\"min\":4.89,\"max\":15.76,\"night\":10.03,\"eve\":11.03,\"morn\":4.89},\"pressure\":1024.76,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":2.09,\"deg\":61,\"clouds\":7},{\"dt\":1539684000,\"temp\":{\"day\":14.59,\"min\":5.86,\"max\":14.59,\"night\":5.86,\"eve\":8.87,\"morn\":9.52},\"pressure\":1027.65,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":5,\"deg\":188,\"clouds\":2},{\"dt\":1539770400,\"temp\":{\"day\":11.66,\"min\":-0.49,\"max\":11.66,\"night\":-0.49,\"eve\":4.39,\"morn\":4.29},\"pressure\":1022.66,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":3.18,\"deg\":191,\"clouds\":31},{\"dt\":1539856800,\"temp\":{\"day\":12.81,\"min\":-0.71,\"max\":12.81,\"night\":-0.71,\"eve\":3.23,\"morn\":0.24},\"pressure\":1017.08,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":2.24,\"deg\":199,\"clouds\":1},{\"dt\":1539943200,\"temp\":{\"day\":13.24,\"min\":-0.98,\"max\":13.24,\"night\":-0.98,\"eve\":2.65,\"morn\":0.1},\"pressure\":1015.19,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":3.03,\"deg\":192,\"clouds\":0},{\"dt\":1540029600,\"temp\":{\"day\":12.74,\"min\":-0.7,\"max\":12.74,\"night\":6.13,\"eve\":7.72,\"morn\":-0.7},\"pressure\":1018.57,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":4.33,\"deg\":175,\"clouds\":46},{\"dt\":1540116000,\"temp\":{\"day\":13.93,\"min\":5.04,\"max\":13.93,\"night\":6.66,\"eve\":9.72,\"morn\":5.04},\"pressure\":1017.73,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":4.69,\"deg\":190,\"clouds\":15},{\"dt\":1540202400,\"temp\":{\"day\":11.48,\"min\":3.4,\"max\":11.48,\"night\":3.4,\"eve\":5.61,\"morn\":7.14},\"pressure\":1018.07,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":2.88,\"deg\":254,\"clouds\":40},{\"dt\":1540288800,\"temp\":{\"day\":14.31,\"min\":3.7,\"max\":14.31,\"night\":7.74,\"eve\":9.47,\"morn\":3.7},\"pressure\":1017.52,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":3.67,\"deg\":256,\"clouds\":64}]}";

        WeatherManiuplate weatherManiuplate = new WeatherManiuplate();
        log.debug("Hello! ");

        Weather ans = weatherManiuplate.parser(strExample);
        List<Day> days= ans.getDays();
        Day day = days.get(0);
        log.debug(day.toString());
        log.debug(day.getTemp().toString());
    }
}