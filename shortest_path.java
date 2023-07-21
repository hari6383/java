import java.util.*;

public class shortest_path {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        if(n==1)
        {
           System.out.println("invalid input");
        }
        else
        {
            System.out.print(arr[0]);  
        }

 }
}

