package apptest.JsonModel;

import lombok.Data;

import java.util.Map;
@Data
public class Day {
    private long dt;
    private Temp temp;
    private float pressure;
    private float humidity;
    private Map<String,String> weather;
    private float speed;
    private float deg;
    private float clouds;

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder()
                .append(" dt = ").append(dt)
                .append(" pressure =").append(pressure)
                .append(" humidity =").append(humidity)
                .append(" speed = ").append(speed)
                .append(" deg = ").append(deg)
                .append(" clouds = ").append(clouds)
                .append(" temp = ").append(temp.toString());

        return out.toString();
    }
}
