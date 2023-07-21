import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1=1;
        int n2=1;
        int n3=0;
        for(int i=3;i<=n;i++)
        {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        }
         System.out.println(n3);
 }
}