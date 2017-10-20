package euler;

public class Problem1
{
	int total = 0;
	int count = 0;
	public Problem1()
	{
		while (count <= 1000)
		{
			if ( count % 5 == 0 || count % 3 == 0 )
			{
				total = total + count;
			}
			count++;
		}
		System.out.println(total);
	}
	
	public static void main(String args[])
	{
		new Problem1();
	}
}
