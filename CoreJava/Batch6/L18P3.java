import java.util.Scanner;

class L18P3{
	public static void main(String[] ss){

		int count = 1;
		int noOfRows;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the no of rows to print:");
		System.out.println("=====================================");
		noOfRows = scan.nextInt();
		System.out.println();
		scan.close();
		
		for( ;count <= noOfRows;count++){ // we can keep empty initialisation box
			System.out.println(count);
		}	
		
	}
}