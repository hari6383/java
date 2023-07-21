
import java.util.Scanner;

public class MaxStockLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        scanner.close();

        int maxPrice = prices[0];
        int maxLoss = 0;

        for (int i = 1; i < n; i++) {
            int currentPrice = prices[i];
            int currentLoss = maxPrice - currentPrice;
            if (currentLoss > maxLoss) {
                maxLoss = currentLoss;
            }
            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
            }
        }

        System.out.println(maxLoss);
    }
}
