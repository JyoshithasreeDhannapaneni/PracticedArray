import java.util.Array;
import java.util.Scanner;
class Str_Unique
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArrays();
		String s1="";
		char d[]=s1.toCharArrays();
		Str_Unique unique=new Str_Unique();
		unique.Unique(c,d);
	}
	public void Unique(char c[],char d[])
	{
		for(int x=0;x<=c.length-1;x++)
		{
			
			if(d[x]==1)
			{
			   continue;
			}
			int count=1;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					d[y]=1;
				}
			}
		     System.out.println(c[x]);
		}
	}
}