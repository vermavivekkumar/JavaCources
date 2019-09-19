import java.util.Scanner;

class L17P4{// How to get input from cmd
			//	One solution is Scanner class
			// How to make this program to more user friendly
			// Problem: Take the input 'no of doubles' from cmd  for calculating their total and print them
	public static void main(String[] ss){

		double totalSum = 0;
		
		int noOfDouble;
		int count = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Program for find the sum of doubles");
		System.out.println("===================================");
		
		
		System.out.println();
		System.out.print("Enter 'no of doubles'  = ");
		noOfDouble = scan.nextInt();
		System.out.println("=========================");
		
		while(count <= noOfDouble){
			System.out.println();
			System.out.print("Enter double  = ");
			totalSum = totalSum + scan.nextDouble();
			count++;
		}
		

		
		scan.close();
		
		System.out.println();		
			
		System.out.println("Sum is "+totalSum);
	
	}
}