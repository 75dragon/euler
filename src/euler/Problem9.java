package euler;

public class Problem9
{
	int a = 1;
	int b = 1;
	int c = 1;

	public Problem9()
	{
		for (int a = 1; a < 998; a++)
		{
			for (int b = 1; b < a; b++)
			{
				for (int c = 1; c < b; c++)
				{
					if (a + b + c == 1000 && a * a == b * b + c * c)
					{
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}

	public static void main(String args[])
	{
		new Problem9();
	}
}
