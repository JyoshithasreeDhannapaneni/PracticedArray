class Array2
{
	public static void main(String[]args)	
	{
		int a[]=new int[]{10,20,30,40,50};
				//20 30 40 50 10
		int b=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(x<a.length-1)
			{ 
			  	a[x]=a[x+1];
			}
		
		}
		a[a.length-1]=b;
		for(int x=0; x<a.length;x++)
		{
			System.out.println(a[x]);
		}	
	}
}