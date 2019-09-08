class L10P2{ // Arithmetic Operator
	public static void main(String[] ss){
		
		int i  = 10;
		int j = 11;
		int k;
		
		k= i+j; // addition
		System.out.println(k);
		
		System.out.println(i*j); // multiplication
		
		i = 15;
		j = 5;		
		System.out.println(i/j); // Division
		
		i  = 18;
		System.out.println(i/j); // Division : if operation performed between two int then answer will also be an int. That's why it is printing 3 (not 3.6) because 3.6 is not int. 
		
		
		double d = 5.0;
		
		System.out.println(i/d); // If operation performed between int and double, then answer will be in double. Hence, we will get correct answer 3.6;

		System.out.println(i*d); // If operation performed between int and double, then answer will be in double ie 90.0 (not 90). 

		System.out.println(17%5); // Modulas operator: It return remainder.. It will answer 2 
		
		i = 10;
		System.out.println(i);
		i++; // It means i = i +1;
		System.out.println(i);
		i--; // It means i = i -1;
		System.out.println(i);
		
		i+=5; // Addition assignment : It means i = i + 5;
		System.out.println(i);
		
		
		}
}