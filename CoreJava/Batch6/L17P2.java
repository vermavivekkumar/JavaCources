import java.util.Scanner;

class L17P2{// How to get input from cmd
			//	One solution is Scanner class
			// Problem: How to make this program to more user friendly?
	public static void main(String[] ss){

		int i,j,k;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Program for find the sum of three integers");
		System.out.println("==========================================");
		
		System.out.println();
		System.out.print("Enter first integer  = ");
		i = scan.nextInt();
		
		System.out.println();
		System.out.print("Enter second integer = ");
		j = scan.nextInt();
		
		System.out.println();
		System.out.print("Enter third integer  = ");
		k = scan.nextInt();
		
		scan.close();
		
		System.out.println();		
		
		sum = i + j + k;
		
		System.out.println("Sum of given three integers is "+sum);
	
	}
}