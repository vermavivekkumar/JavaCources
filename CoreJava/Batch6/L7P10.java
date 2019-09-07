class L7P10{ // datatype char
	public static void main(String[] ss){
		
		char c ;//= 'ab'; 
		/*
		
		Compilation Error:
		
		L7P10.java:4: error: unclosed character literal
                char c = 'ab';
                         ^
		L7P10.java:4: error: unclosed character literal
                char c = 'ab';
				
		L7P10.java:4: error: not a statement
                char c = 'ab';
		
		*/
		System.out.println("Hi, value of char is "+c);// print statement
		
		
		c = "u"; //L7P10.java:22: error: incompatible types: String cannot be converted to char
		System.out.println("Hi, value of char is "+c);// print statement
				
	} 
}