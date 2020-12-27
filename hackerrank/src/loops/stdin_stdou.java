package loops;

import java.util.Scanner;

public class stdin_stdou {

	public static void main(String[] args) 
	{
		String a="hello";
		String b="java";
		System.out.println(a.length()+b.length());
		
		if(a.compareTo(b)>=0)
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
		
		String c=a.substring(0, 1).toUpperCase()+a.substring(1);
		String d=b.substring(0, 1).toUpperCase()+b.substring(1);
		System.out.println(c+" "+d);
	}

}
