import java.util.*;
public class factorial {
    
public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            count=count*i;
        }
        System.out.println(count);
    }
}
