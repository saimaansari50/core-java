package loops;

public class StringReverse {

	public static void main(String[] args)
	{
		String s="madamm";
		if(s.compareTo(palindrome(s))==0)
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}

	}

	private static String palindrome(String s) {
		char[] a=s.toCharArray();
		for(int i=0;i<a.length/2;i++)
		{
			char temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		String b=new String(a);
		return b;
	}

}
