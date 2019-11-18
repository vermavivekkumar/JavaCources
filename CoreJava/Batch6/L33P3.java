// static methods
class L33P3{

	public static void main(String[] ss){

		A a1 = new A();
		a1.m1();
		A.m3();
	}
}

class A{

	void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}
	static void m3(){
		System.out.println("static m3");
		m4();
	}
	static void m4(){
		System.out.println("static m4");
	}
	
}


