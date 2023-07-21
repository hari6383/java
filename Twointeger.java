import java.util.Scanner;

public class Twointeger {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int arr[]={5,7,1,2,8,4,3};
        int a=obj.nextInt();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[i]+arr[j]==a)
                {
                    count++;  
                }
                
            }
            
        }
        System.out.print(count);
        

        
    }
}
