class L25P2{
	public static void main(String args[]){
		A a = new A();
		
		System.out.println(a.i);
		System.out.println(a.j);
		
		A b;
		
		b = a;
		b.i = 100;
		b.j = 200;
		
		b = new A();
		System.out.println(a.i);
		System.out.println(a.j);		
	}
}

class A{
	int i=5;
	int j;
}