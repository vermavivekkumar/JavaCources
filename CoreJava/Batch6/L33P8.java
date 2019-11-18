// static methods
class L33P8{

	public static void main(String[] ss){

		A a1 = new A(10,20);
		A.k = 500;

		a1.m1();		
		
	}
}

class A{
	int i,j;
	static int k;

	A(int i, int j){
		this.i = i;
		this.j = j;
	}

	void m1(){
		System.out.println("m1 "+i);
		m2();
	}
	void m2(){
		System.out.println("m2 "+j);
		m3();
	}
	static void m3(){
		System.out.println("static m3 "+k);
		m4();
	}
	static void m4(){
		System.out.println("static m4 "+i); // error: non-static variable i cannot be referenced from a static context
	}
	
}

