class L7P5{ // By default compiler treated any floating point number as double
	public static void main(String[] ss){
		
		float flt = 7.8; // Compilation Error:  L7P5.java:4: error: incompatible types: possible lossy conversion from double to float
		System.out.println("Hi, value of float is "+flt);// print statement
		
	} 
}