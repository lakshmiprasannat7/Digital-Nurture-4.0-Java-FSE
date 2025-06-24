public class FinancialForecasting {

    // Method to calculate future value recursively
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if no years left, return the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: calculate future value for the next year
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Initial investment
        double growthRate = 0.05; // 5% growth rate
        int years = 10; // Number of years to forecast

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
