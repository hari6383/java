import java.util.*;

public class Ashumaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of books
        int m = sc.nextInt(); // coin value

        ArrayList<Integer> books = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            if (cost <= m) {
                books.add(cost);
            }
        }

        // output the results
        int k = books.size();
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.println(books.get(i));
        }

        sc.close();
    }
}
