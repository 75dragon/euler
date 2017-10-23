package euler;

public class Problem10
{
	long total = 0;
	public Problem10()
	{
		for (int i = 0; i < 2000000; i++ )
		{
			if (isPrime(i))
			{
				total = total + i;
			}
		}
		System.out.println(total);
	}
	
	public boolean isPrime(int x)
	{
		if (x < 2)
		{
			return false;
		}
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main ( String args[] )
	{
		new Problem10();
	}
}
