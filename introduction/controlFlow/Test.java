package introduction.controlFlow;

public class Test {
    public static void main(String[] args) {

        int[] prices = {1, 4, 2};

        solvePricesProblem(prices);

    }

    private static void solvePricesProblem(int[] prices) {
        int i = 0;
        int j = i + 1;
        int profitCal;
        int profit = 0;
        while (i < prices.length && j < prices.length) {

            try {
                profitCal = prices[j] - prices[i];

                if (profitCal > profit) {
                    profit = profitCal;
                }

                if (j == prices.length - 1) {
                    i++;
                    j = i + 1;
                } else {
                    j++;
                }
            } catch (Exception e) {

                System.exit(1);
            }
        }
        System.out.println(profit);
    }
}
