// static methods
class L33P1{

	public static void main(String[] ss){

		A a1 = new A();
		a1.m1();
		A.m2(); // call a static method
		a1.m2(); // call a static method using a reference variable, however, it is not a good coding practice
		B.m2();
	}
}

class A{

	void m1(){
		System.out.println("m1");
	}
	static void m2(){
		System.out.println("static m2");
	}
	
}

class B{

	void m1(){
		System.out.println("m1 of class B");
	}
	static void m2(){
		System.out.println("static m2 of class B");
	}
	
}
