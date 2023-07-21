import java.util.*;
class pattern
{
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("Size");
int n=sc.nextInt();

	for(i=1;i<=n;i++)
	{
		{
			if(i==1||i==n)
			{
						for(j=1;j<=n;j++)
				System.out.print("* ");
			}
			else
			{
				for(j=1;j<=n;j++)
				{
					if(j==1||j==n)
					{System.out.print("* ");}
				
				else if(i==j||j==n-i+1)
				{
					System.out.print("* ");
				}
				
				else
					System.out.print("  ");
	
				}
				
				
				
				
			}
			
          
		  	   
		}
		
		
		
		System.out.println("");

		
		
		
	}
	
	
	
	
}


}