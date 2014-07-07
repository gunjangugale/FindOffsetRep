import java.util.Scanner;

/*
 * Write a program to accept a nonempty string of 0's and 1's as an argument. 
 * The program will print the offsets of runs, each run consisting of all 0's or all 1's, 
 * where the runs are longer than 1. For example, if given "0010011" it will print 
 * "0, 3, 5" on stdout.
 */

public class FindOffset {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String strin = scanner.next();
		
		if (strin != null)
		{
			String strout = OffsetFinder(strin);
			System.out.println("Offset at : " + strout);
		}
		else
			System.out.println("Input string is empty");
		
		scanner.close();
	}
	
	public static String OffsetFinder(String strin)
	{
		int pos = 0;
		String strout = "";
		char this_elem;
		char last_elem;
		int max_pos = strin.length();
		int count = 1;
		
		last_elem = strin.charAt(pos);
		for (pos = 1; pos < max_pos; pos++)
		{
			this_elem = strin.charAt(pos);
			if (last_elem == this_elem)
			{
				count++;
			}
			else
			{
				if (count > 1)
				{
					strout = strout + String.valueOf(pos-count) + ", ";					
				}
				count = 1;
			}
			last_elem = this_elem;
		}
		
		if (count > 1)
		{
			strout = strout + String.valueOf(pos-count) + ", ";					
		}
		
		return strout;
		
	}

}
