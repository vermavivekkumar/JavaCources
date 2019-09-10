class L11P1{ // Automatic type pramotion
	public static void main(String[] ss){
		
		byte i,j,k;
		i = 15;
		j = 6;
		
		k = i + j; // L11P1.java:8: error: incompatible types: possible lossy conversion from int to byte
   
		System.out.println(k);
		
	}
}