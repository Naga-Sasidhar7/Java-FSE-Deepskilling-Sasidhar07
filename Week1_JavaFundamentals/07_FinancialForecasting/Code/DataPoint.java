package Week1_Exercises.Data_Structures_And_Algorithms.Financial_Forecasting;

public class DataPoint {
        private int year;
        private double value;

        public DataPoint(int year, double value) {
            this.year = year;
            this.value = value;
        }

        public int getYear() {
            return year;
        }

        public double getValue() {
            return value;
        }
    }

