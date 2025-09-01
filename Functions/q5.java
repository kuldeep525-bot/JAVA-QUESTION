// 5. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.

 class FutureInvestmentValue {

   static double computeFutureInvestmentValue(double presentValue, double annualInterestRate, int years) {
        return presentValue * Math.pow(1 + annualInterestRate, years);
    }

    public static void main(String st[]) {
        double presentValue = 100000.0; 
        double annualInterestRate = 0.5;
        int years = 10; 

        double futureValue = computeFutureInvestmentValue(presentValue, annualInterestRate, years);
        System.out.printf("The future investment value is: %.2f%n", futureValue);
    }
}