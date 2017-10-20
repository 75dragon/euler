package euler;

public class Problem6
{
	public Problem6()
	{
		int one = 0;
		int two = 0;
		for (int i = 1; i <= 100; i++)
		{
			one = one + i * i;
		}
		for (int i = 1; i <= 100; i++)
		{
			two = two + i;
		}
		two = two * two;
		two = two - one;
		System.out.println(two);
	}
	
	public static void main(String args[])
	{
		new Problem6();
	}
}
