package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem13
{
	ArrayList<String> nums = new ArrayList<String>();

	public Problem13()
	{
		readFile();
		System.out.println(addStringNums());
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
		File file = new File("C:\\Users\\austi\\Dropbox\\java\\euler\\src\\sumNums.txt");

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
		while (scanalations.hasNext())
		{
			line = scanalations.nextLine();
			nums.add(line);
		}

	}

	public String addStringNums()
	{
		String build = "";
		int rem = 0;
		int index = 0;
		while (rem != 0 || index <= nums.get(0).length())
		{
			for (int i = 0; i < nums.size(); i++)
			{
				if (index < nums.get(i).length())
				{
					rem = Integer.parseInt(
							nums.get(i).substring(nums.get(i).length() - index - 1, nums.get(i).length() - index)) + rem;
				}
			}
			build = rem % 10 + build;
			rem = rem / 10;
			index++;
		}
		return build;
	}

	public static void main(String args[])
	{
		new Problem13();
	}
}
