package euler;

public class Problem4
{
	public Problem4()
	{
		for (int x = 100; x < 1000; x++)
		{
			for (int y = 100; y < 1000; y++)
			{
				if (isPal(x * y))
				{
					System.out.println(x * y + " " + x + " " + y);
				}
			}
		}
	}
	
	public boolean isPal(int x)
	{
		int r = 0;
		int sum = 0;
		int temp = x;
		while ( temp > 0 )
		{
			r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		return sum == x;
	}
	public static void main(String args[])
	{
		new Problem4();
	}
}
