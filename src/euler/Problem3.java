package euler;

public class Problem3
{
	long number = 600851475143L;
	int sqrt;
	public Problem3()
	{
		sqrt = (int) Math.pow(number, .5);
		for (long i = 2; i < sqrt; i++)
		{
			if (number % i == 0)
			{
				number = number / i;
				sqrt = (int) Math.pow(number, .5);
				i = 1;
			}
		}
		System.out.println(number);
	}
	public static void main(String args[])
	{
		new Problem3();
	}
}
