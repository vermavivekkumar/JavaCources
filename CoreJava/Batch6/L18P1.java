import java.util.Scanner;

class L18P1{
	public static void main(String[] ss){

		int rowCount;
		rowCount = 1;
		
		int count;
		int noOfRows;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the no of rows to print:");
		System.out.println("=====================================");
		noOfRows = scan.nextInt();
		
		
		while(rowCount <= noOfRows){
			count = 1;
			while(count <= rowCount){
				System.out.print("+");
				System.out.print(" ");
				count++;
			}
			System.out.println();
			rowCount++;
		}
		
	}
}