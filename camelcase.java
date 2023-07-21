import java.util.*;
class camelcase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split("str");
        int n=str.length();
        char c[]=str.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                c[i]=Character.toUpperCase(c[i]);
            }
            if(c[i]==' ')
            {
                c[i+1]=Character.toUpperCase(c[i+1]);

            }

            
            System.out.print(c[i]);
     }
   }
}