package apptest.JsonModel;

import lombok.Data;

@Data
public class Temp {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;

    @Override
    public String toString(){
        StringBuilder answ = new StringBuilder()
                .append(" day = ").append(day)
                .append(" min = ").append(min)
                .append("max = ").append(max)
                .append(" night =").append(night)
                .append(" eve = ").append(eve)
                .append(" morn = ").append(morn);
        return answ.toString();
    }
}
