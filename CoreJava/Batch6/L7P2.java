class L7P2{ // datatype byte : overflow
	public static void main(String[] ss){
		
		byte b;
		
		b = 128; // Assigning a number which is outer then renge of byte
		// it will give compilation error
		//L7P2.java:7: error: incompatible types: possible lossy conversion from int to byte
		System.out.println("Hi, value of byte is "+b);// print statement
		
		b = -129; // Assigning a number which is outer then renge of byte
		// it will give compilation error
		//L7P2.java:7: error: incompatible types: possible lossy conversion from int to byte
		System.out.println("Hi, value of byte is "+b);// print statement
		
	} 
}