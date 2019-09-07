class L8P2{ // Floating point Literals
	public static void main(String[] ss){
		
		double d = 36.0; // valid
		//float f = 36.0; //invalid   .. Compilation error: L8P2.java:5: error: incompatible types: possible lossy conversion from double to float
		float f = 36.0f;
		double d2 = 3.6e1; // Scientific notation
		
		double d3 = 0x12p1; // Hexadecimal floating point (It only used for Scientific notation.... p= binary exponent, it indicate power of 2)
		
		System.out.println("d = "+d);
		System.out.println("f = "+f);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);

	}
}