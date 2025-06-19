package Week1_Exercises.Data_Structures_And_Algorithms.Financial_Forecasting;

public class Main {
    public static void main(String[] args) {
        double initialValue = 500.0;
        double growthRate = 0.10;
        int years = 5;

        Forecast forecast = new Forecast(initialValue, growthRate);

        for (int i = 0; i <= years; i++) {
            double predicted = forecast.predictValue(i);
            System.out.printf("Year %d: %.2f\n", i, predicted);
        }
    }
}