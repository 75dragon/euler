package euler;

public class Problem12
{
	int count = 1;
	long total = 0;
	int countdiv = 2;
	int sqrt;
	public Problem12()
	{
		while (countdiv < 498)
		{
			countdiv = 2;
			total = count + total;
			count++;
			for (int i = 2; i < (int)Math.sqrt(total); i++)
			{
				if (total % i == 0)
				{
					countdiv = countdiv + 2;
				}
			}
		}
		System.out.println(total);
	}
	
	public static void main(String args[])
	{
		new Problem12();
	}
}
