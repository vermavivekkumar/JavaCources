class L13P2{ // if else statement 

	public static void main(String[] ss){
		
		int sellingPrice;
		int buyingPrice;
		
		System.out.println("Before first if statement");
		
		sellingPrice = 50;
		buyingPrice = 100;
		
		if(sellingPrice>buyingPrice){
			System.out.println("First if Profit");
		}else{
			System.out.println("First if Not Profit");	
		}
		
		System.out.println("After first if block");
		
		System.out.println("----------------------------------------------------------------");
		
		sellingPrice = 50;
		buyingPrice = 100;
		
		System.out.println("Before second if statement");
		if(sellingPrice>buyingPrice)
			System.out.println("Second if Profit");
		else
			System.out.println("Second if Not Profit");		
		
		System.out.println("After Second if block");
		
	}
}