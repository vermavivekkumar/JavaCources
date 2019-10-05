class L25P3{
	public static void main(String args[]){
		A a = new A();
		a.i = 100;
		a.j = 200;
		System.out.println(a.i);
		System.out.println(a.j);
		m1(a);
		System.out.println(a.i);
		System.out.println(a.j);
			
	}
	
	static void m1(A b){
		b.i = 50;
		b.j = b.i + 10;
	}
}

class A{
	int i=5;
	int j;
}