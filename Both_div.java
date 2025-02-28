class Both_div
{
	public static void main(String[]args)
	{
		int num=15;
	if(num%3==0&&num%5==0)
	{
		System.out.println("Fizz Buzz");
	}
	else if(num%3==0)
	{
		System.out.println("Fizz");
	}
	else if(num%5==0)
	{
		System.out.println("Buzz");
	}
	else
	{
		System.out.println(num+ " it is neither Fizz nor Buzz");
	}
	}
}