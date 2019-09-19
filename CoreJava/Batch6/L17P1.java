import java.util.Scanner;

class L17P1{// Problem: How to get input from cmd
			//	One solution is Scanner class
	public static void main(String[] ss){

		int i,j,k;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Find out sum of following three no:");
		
		/*i = 10;
		j = 11;
		k = 100;*/
	
		i = scan.nextInt();
		j = scan.nextInt();
		k = scan.nextInt();
		
		
		sum = i + j + k;
		
		System.out.println("Sum of given three no is "+sum);
	
	}
}