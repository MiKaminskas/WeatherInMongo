package apptest.JsonModel;

import lombok.Data;

import java.util.Map;
@Data
public class Day {
    private long dt;
    private Map<String,String> temp;
    private float pressure;
    private float humidity;
    private Map<String,String> weather;
    private float speed;
    private float deg;
    private float clouds;
}
