class L23P3{// Problem: output?
	public static void main(String args[]){
		m1();
		m2();
	}
	
	
	static void m2(){
		System.out.println("m2");
		m1();
	}
	static void m1(){
		System.out.println("m1");
	}
	
}