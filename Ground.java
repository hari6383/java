
import java.util.Scanner;

public class Ground {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[n][n];
        dp[0][0] = 0;

        // Fill the first row
        for (int j = 1; j < n; j++) {
            if (maze[0][j] == 1) {
                dp[0][j] = Integer.MAX_VALUE;
            } else {
                dp[0][j] = dp[0][j - 1] + 1;
            }
        }

        // Fill the first column
        for (int i = 1; i < n; i++) {
            if (maze[i][0] == 1) {
                dp[i][0] = Integer.MAX_VALUE;
            } else {
                dp[i][0] = dp[i - 1][0] + 1;
            }
        }

        // Fill the rest of the dp table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (maze[i][j] == 1) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else {
                    int min = Math.min(dp[i][j - 1], dp[i - 1][j]);
                    if (i == j) {
                        min = Math.min(min, dp[i - 1][j - 1]);
                    }
                    dp[i][j] = min + 1;
                }
            }
        }

        int minSteps = dp[n - 1][n - 1];
        if (minSteps == Integer.MAX_VALUE) {
            System.out.println("No path found");
        } else {
            System.out.println(minSteps);
        }
    }
}

