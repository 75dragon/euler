package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem11
{
	int[][] numbers = new int[20][20];

	public Problem11()
	{
		readFile();
		System.out.println(findHigh());
	}

	public static Scanner userScanner = new Scanner(System.in);

	/**
	 * attempts to scan the given file
	 * 
	 * @return the scanner for the file or null
	 */
	public static Scanner openInputFile()
	{
		// String filename;
		Scanner scanner = null;

		// System.out.print("Enter the input filename: ");
		// filename = userScanner.nextLine();
		File file = new File("C:\\Users\\austi\\Dropbox\\java\\euler\\src\\numgrid.txt");

		try
		{
			scanner = new Scanner(file);
		} // end try
		catch (FileNotFoundException fe)
		{
			System.out.println("Can't open input file\n");
			return null; // array of 0 elements
		} // end catch
		return scanner;
	}

	public void readFile()
	{
		Scanner scanalations = openInputFile(); // new scanner to use
		String line = ""; // a line of the text doc
		int row = 0;
		while (scanalations.hasNext())
		{
			line = scanalations.nextLine();
			for (int i = 0; i < line.length(); i = i + 3)
			{
				numbers[i/3][row] = Integer.parseInt(line.substring(i, i + 2));
				System.out.println(numbers[i/3][row] + " " + i);
			}
			row++;
		}

	}

	public int findHigh()
	{
		int max = 0;
		for (int j = 0; j < 20; j++)
		{
			for (int i = 0; i < 17; i++)
			{
				if (max < numbers[i][j]* numbers[i+1][j] * numbers[i+2][j] * numbers[i+3][j] )
				{
					max = numbers[i][j]* numbers[i+1][j] * numbers[i+2][j] * numbers[i+3][j];
				}
			}
		}
		for (int j = 0; j < 17; j++)
		{
			for (int i = 0; i < 20; i++)
			{
				if (max < numbers[i][j]* numbers[i][j+1] * numbers[i][j+2] * numbers[i][j+3] )
				{
					max = numbers[i][j]* numbers[i][j+1] * numbers[i][j+2] * numbers[i][j+3];
				}
			}
		}
		for (int j = 0; j < 17; j++)
		{
			for (int i = 0; i < 17; i++)
			{
				if (max < numbers[i][j]* numbers[i+1][j+1] * numbers[i+2][j+2] * numbers[i+3][j+3] )
				{
					max = numbers[i][j]* numbers[i+1][j+1] * numbers[i+2][j+2] * numbers[i+3][j+3];
				}
			}
		}
		for (int j = 3; j < 19; j++)
		{
			for (int i = 0; i < 17; i++)
			{
				if (max < numbers[i][j]* numbers[i+1][j-1] * numbers[i+2][j-2] * numbers[i+3][j-3] )
				{
					max = numbers[i][j]* numbers[i+1][j-1] * numbers[i+2][j-2] * numbers[i+3][j-3];
				}
			}
		}
		return max;
	}

	public static void main(String args[])
	{
		new Problem11();
	}
}
