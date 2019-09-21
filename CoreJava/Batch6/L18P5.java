import java.util.Scanner;

class L18P5{
	public static void main(String[] ss){

		int count = 1;
		int noOfRows;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the no of rows to print:");
		System.out.println("=====================================");
		noOfRows = scan.nextInt();
		System.out.println();
		scan.close();
		
		for( ;;){ // we can keep empty condition box.. If we keep condition box is empty then it will act like 'true'... It will be a infinite loop..
			System.out.println(count);
			count++;
		}	
		
	}
}