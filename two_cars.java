import java.util.*;
public class two_cars {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        int a1=obj.nextInt();
        int b1=obj.nextInt();
        int c1=obj.nextInt();
        int d1=obj.nextInt();
        int e1=obj.nextInt();
        int a2=obj.nextInt();
        int b2=obj.nextInt();
        int c2=obj.nextInt();
        int d2=obj.nextInt();
        int e2=obj.nextInt();

        int a=c1+(d1/a1)*60+e1*60;
        int b=c2+(d2/a2)*60+e2*60;
        System.out.println(a);
        
        if(a>b)
        {
            System.out.println("Disel");
        }
        else
        {
            System.out.println("Petrol");
        }
            
    }
}