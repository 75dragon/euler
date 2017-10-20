package euler;

public class Problem5
{
	int number = 1;
	int hold;

	public Problem5()
	{
		for (int i = 2; i <= 20; i++)
		{
			if (isPrime(i))
			{
				hold = i;
				while(i * hold < 20)
				{
					hold = hold * i;
				}
				number = number * hold;
			} 
		}
		System.out.println(number);
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

	public int gcd(int x, int y)
	{
		for (int i = x; i > 1; i--)
		{
			if (x % i == 0 && y % i == 0)
			{
				System.out.println(x + " " + y + " " + i);
				return i;
			}
		}
		return 0;
	}

	public static void main(String args[])
	{
		new Problem5();
	}
}
