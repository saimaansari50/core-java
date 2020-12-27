package loops;

public class ArrayGame {

	static boolean flag=false;
	public static void main(String[] args)
	{
		int[] game= {0,0,0,1,1,1};
		int n=game.length;
		int i=0;
		int leap=5;
		System.out.println(canWin(leap,game,i)? "YES" : "NO");
	}

	private static boolean canWin(int leap, int[] game, int i)
	{
		if(i>game.length)
		{
			flag=true;
			return flag;
			
		}
		else if(game[i+leap]==0 || game[i+1]==0 || game[i-1]==0) 
		{
			
			if(game[i+leap]==0 && i+leap!=game.length)
		{
			if(i+leap==game.length)
			{
				flag=true;
			}
			else
			{
			i=i+leap;
			}
		}
		else if(game[i+1]==0 && i+1!=game.length)
		{
			i=i+1;
		}
		else if(game[i-1]==0 && game[i]!=0)
		{
			i=i-1;
		}
		}
		
		return flag;
		
		
	}

}
