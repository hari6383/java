package Star_patterns;

public class Butterfly {
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=1;i<n;i++,System.out.println(""))
        {
            for(j=1;j<=i;j++,System.out.print("* "))
            {

            }
            for(j=i;j<n;j++,System.out.print("  "))
            {

            }
            for(j=i;j<n;j++,System.out.print("  "))
            {

            }
            for(j=1;j<=i;j++,System.out.print("* "))
            {

            }
            
        }

        for(i=1;i<=n;i++,System.out.println(""))
        {
            for(j=i;j<=n;j++,System.out.print("* "))
            {

            }
            for(j=1;j<i;j++,System.out.print("  "))
            {

            }
            for(j=1;j<i;j++,System.out.print("  "))
            {

            }
            for(j=i;j<=n;j++,System.out.print("* "))
            {

            }
            
        }
    }
}
