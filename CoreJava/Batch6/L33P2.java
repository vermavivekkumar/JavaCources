// static methods
class L33P2{

	public static void main(String[] ss){

		A a1 = new A();
		a1.m1();
		A.m2();// error: non-static method m2() cannot be referenced from a static context 
		       // A.m2();
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

class B{

	void m1(){
		System.out.println("m1 of class B");
	}
	void m2(){
		System.out.println("m2");
	}
	static void m3(){
		System.out.println("static m3 of class B");
	}
	static void m4(){
		System.out.println("static m4 of class B");
	}
	
}
