package euler;

public class Problem2
{
	int one = 1;
	int two = 2; 
	int thr = 0;
	int sum = 2;
	public Problem2()
	{
		while (thr < 4000000)
		{
			thr = one + two;
			if (thr % 2 == 0)
			{
				sum = sum + thr;
			}
			one = two;
			two = thr;
		}
		System.out.println(sum);
	}
	public static void main	(String args[])
	{
		new Problem2();
	}
}
