package Week1_Exercises.Data_Structures_And_Algorithms.Financial_Forecasting;

import java.util.HashMap;
import java.util.Map;

public class Forecast {
    private double initialValue;
    private double growthRate;
    private Map<Integer, Double> memo = new HashMap<>();

    public Forecast(double initialValue, double growthRate) {
        this.initialValue = initialValue;
        this.growthRate = growthRate;
    }


    public double predictValue(int year) {
        if (year == 0) return initialValue;

        if (memo.containsKey(year)) return memo.get(year);

        double predicted = predictValue(year - 1) * (1 + growthRate);
        memo.put(year, predicted);
        return predicted;
    }
}