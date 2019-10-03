class L23P4{// Problem: output?
	public static void main(String args[]){
		System.out.println(m1(11,5));
	}
	
	
	static int m2(int i){
		return i+5;
	}
	static int m1(int i, int j){
		return m3(i-j);
	}
	static int m3(int j){
		return m2(j+j);
	}
	
}