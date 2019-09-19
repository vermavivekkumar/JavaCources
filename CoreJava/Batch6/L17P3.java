import java.util.Scanner;

class L17P3{// How to get input from cmd
			//	One solution is Scanner class
			// How to make this program to more user friendly
			// Problem: get a double input from cmd using scanner
	public static void main(String[] ss){

		double i,j,k;
		double sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Program for find the sum of three doubles");
		System.out.println("==========================================");
		
		System.out.println();
		System.out.print("Enter first double  = ");
		i = scan.nextDouble();
		
		System.out.println();
		System.out.print("Enter second double = ");
		j = scan.nextDouble();
		
		System.out.println();
		System.out.print("Enter third double  = ");
		k = scan.nextDouble();
		
		scan.close();
		
		System.out.println();		
		
		sum = i + j + k;
		
		System.out.println("Sum of given three integers is "+sum);
	
	}
}