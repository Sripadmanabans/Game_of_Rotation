package game_of_rotation;

import java.util.Scanner;

public class GameOfRotation 
{
	public static void rotate(long value[], int n) 
	{
		long max;
		long total = 0;
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += value[i];
			total += (value[i] * (i + 1));
		}
		max = total;
		for(int i = 0; i < n; i++)
		{
			total += sum;
			total -= (value[n - 1 - i] * n);
			if(total > max)
			{
				max = total;
			}
		}
		System.out.println(max);
	}
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		long value[] = new long[n];
		for(int i = 0; i < n; i++)
		{
			value[i] = sr.nextInt();
		}
		rotate(value, n);
		sr.close();
	}
}
