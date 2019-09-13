class L13P1{ // if statement 
			// Problem: To find out profit
	public static void main(String[] ss){
		
		int sellingPrice;
		int buyingPrice;
		
		System.out.println("Before first if statement");
		
		sellingPrice = 150;
		buyingPrice = 100;
		
		if(sellingPrice>buyingPrice){
			System.out.println("First if Profit");
		}
		
		System.out.println("After first if block");
		
		System.out.println("----------------------------------------------------------------");
		
		sellingPrice = 100;
		buyingPrice = 90;
		
		System.out.println("Before sceond if statement");
		if(sellingPrice>buyingPrice)
		System.out.println("Second if Profit");
		System.out.println("After Second if statement");

		System.out.println("----------------------------------------------------------------");
		
		sellingPrice = 80;
		buyingPrice = 90;
		
		System.out.println("Before third if statement");
		if(sellingPrice>buyingPrice)
		System.out.println("third if Profit");
		System.out.println("After third if statement");
	}
}