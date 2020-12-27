package loops;
import java.math.*;
import java.util.Scanner;
public class two {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		for(int i=0;i<z;i++)
		{
			int sum=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				if(j==0)
				{
				sum=(int) (sum+a+((Math.pow(2, j)*b)));
				}
				else
				{
					sum=(int)(sum+(Math.pow(2, j)*b));
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
