public class FinancialForecasting {

    // RECURSIVE method - predicts future value after 'years' years
    // Formula: futureValue = presentValue * (1 + growthRate)^years
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {

        // BASE CASE - stop recursion when no years left
        if (years == 0) {
            return presentValue;
        }

        // RECURSIVE CASE - apply growth for one year, then recurse
        double valueAfterOneYear = presentValue * (1 + growthRate);
        return calculateFutureValue(valueAfterOneYear, growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000.0;  // Starting amount (Rs. 10,000)
        double growthRate   = 0.08;     // 8% annual growth
        int    years        = 5;        // Forecast 5 years ahead

        System.out.println("=== FINANCIAL FORECASTING (Recursive) ===");
        System.out.println("Present Value : Rs. " + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "% per year");
        System.out.println("Years         : " + years);
        System.out.println();

        // Show year by year
        for (int y = 1; y <= years; y++) {
            double futureVal = calculateFutureValue(presentValue, growthRate, y);
            System.out.printf("After %d year(s): Rs. %.2f%n", y, futureVal);
        }

        System.out.println("\n=== ANALYSIS ===");
        System.out.println("Time Complexity : O(n) - one recursive call per year");
        System.out.println("Space Complexity: O(n) - call stack grows with each year");
        System.out.println("Optimization    : Use iteration or memoization to reduce stack usage.");
    }
}