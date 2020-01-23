package wed;

	import java.util.Scanner;

	public class ChangeMaker 
		
	
	{


		public static void main(String[] args)
		{

		Scanner scan = new Scanner(System.in);
		
			
		final int PENNIES = 1;
		final int NICKELS = 5;
		final int DIMES = 10;
		final int QUARTERS = 25;
		
		
		System.out.print("Enter any whole number from 1 to 99: ");
		int cents = scan.nextInt();
		
		System.out.println(cents + " cents in coins can be given as: ");
		
		
		
		int totalQuarters = cents / QUARTERS;
		cents %= QUARTERS;
		
		
		int totalNickels = cents / NICKELS;
		cents %= NICKELS;
		
		
		int totalPennies = cents / PENNIES;
		cents %= PENNIES;
		
		
			int totalDimes = (cents / DIMES);
		cents %= DIMES;
					
		
		if (totalDimes >0)
			
			System.out.println(totalDimes + " dimes");
		
			if 
			(totalQuarters >0)
					
		System.out.println(totalQuarters + " quarters");
		
			if
			(totalNickels >0)
				
		System.out.println(totalNickels + " nickels and");
			
			if 
			(totalPennies >0)
				
		System.out.println(totalPennies + " pennies");
		
		
		scan.close();
		
	

		}

	}