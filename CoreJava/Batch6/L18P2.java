// for loop

import java.util.Scanner;

class L18P2{
	public static void main(String[] ss){

		int count;
		int noOfRows;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the no of rows to print:");
		System.out.println("=====================================");
		noOfRows = scan.nextInt();
		System.out.println();
		scan.close();
		
		for(count = 1;count <= noOfRows;count++){
			System.out.println(count);
		}	
		
	}
}