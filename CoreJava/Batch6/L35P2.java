class L35P2{

	public static void main(String[] ss){

		B b1 = new B(100);
	}
}

class A{
	int i = 10;
	A(){System.out.println("default of A");}
	A(int i){
		this.i = i;
		System.out.println("A(int)");
	}
	
}

class B{
	int j = 20;
	B(){System.out.println("default of B");}
	B(int j){
		this.j = j;
		System.out.println("B(int)");
	}
}