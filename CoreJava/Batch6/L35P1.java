class L35P1{

	public static void main(String[] ss){

		B b1 = new B();
		b1.m2();
		b1.m1();
		System.out.println(b1.i);

	}
}

class A{
	int i = 10;
	void m1(){
		System.out.println("m1 of class A");
	}	
	
}

class B extends A{
	int j = 20;
	void m2(){
		System.out.println("m2 of class B");
	}	
}

