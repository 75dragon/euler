package euler;

public class Problem7
{
	int x = 0;
	int y = 2;
	public Problem7()
	{
		while (x < 10002)
		{
			if (isPrime(y))
			{
				x++;
			}
			y++;
		}
		System.out.println(y);
	}
	public boolean isPrime(int x)
	{
		for (int i = 2; i < x / 2; i++)
		{
			if ( x % i == 0 )
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		new Problem7();
	}
}
