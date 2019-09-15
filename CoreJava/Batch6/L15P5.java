class L15P5{ // Nested while loop.
	public static void main(String[] ss){

		int rowCount;
		rowCount = 1;
		
		int count;
		
		while(rowCount <= 9){
			count = 1;
			while(count <= rowCount){
				System.out.print(count);
				System.out.print(" ");
				count++;
			}
			System.out.println();
			rowCount++;
		}
		
	}
}