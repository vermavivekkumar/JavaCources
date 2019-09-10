class L11P4{ // Bitwise Operator

// It works only on numbers (integers and floating point)
// It's outcome always a boolean
	public static void main(String[] ss){
   
		int i=1;
		int j;
		j = ~i; // Unary NOT
		System.out.println(j);
		
		i = 2;
		j = 3;
		int k = i & j; // Bitwise AND
		System.out.println(k);
		
		i = 2;
		j = 3;
		k = i | j; // Bitwise OR
		System.out.println(k);
		
		i = 2;
		j = 3;
		k = i^j; // Exclusive OR
		System.out.println(k);
		
		i = 7;
		k = i >> 1; // Right Shift by one place
		System.out.println(k);
		
		i = 7;
		k = i >> 2; // Right Shift by two place
		System.out.println(k);
		
		i = -7;
		k = i >> 1; // Right Shift by one place
		System.out.println(k);
		
		i = 7;
		k = i << 1; // Left Shift by one place
		System.out.println(k);
		
		i = 7;
		k = i << 2; // Left Shift by two place
		System.out.println(k);
		
		i = -7;
		k = i >>> 1; // Right shift fill zero
		System.out.println(k);

	}
}