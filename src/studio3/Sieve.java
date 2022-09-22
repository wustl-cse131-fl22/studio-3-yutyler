package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your n-value? ");
		int n = in.nextInt();
		
		boolean[] markers = new boolean[n+1];
		for (int i = 2; i <= n; i++)
		{
			for (int j = 2; i*j <= n; j++)
			{
				markers[i*j] = true;
			}
		}
		
		System.out.println("These are prime: ");
		for (int k = 2; k <= n; k++)
		{
			if (markers[k] == false)
			{
				System.out.println(k + ", ");
			}
		}
		
		
		
		

	}

}
