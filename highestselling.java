import java.util.*;

public class highestselling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]+arr[n-2]);
}
}
