import java.util.*;
public class factorialzero {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=1;
        int r,ans=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            count=count*i;
        }
        if(count%2!=0)
        {
           System.out.println("0");
        }
        else
        {
            while(count>0)
            {
                r=count%10;
                sum=(sum*10)+r;
                if(sum==0)
                {
                    ans++;
                }
                count=count/10;
            }
             System.out.println(ans);
        }
    }
}
