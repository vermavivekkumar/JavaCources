// static methods
class L33P7{

	public static void main(String[] ss){

		A a1 = new A(10,20);
		A a2 = new A(100,200);
		A.k = 500;

		a1.m1();
		A.m3();
		
		a2.m1();
		a2.m3();
		
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
		System.out.println("static m4");
	}
	
}

