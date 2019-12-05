class L35P3{

	public static void main(String[] ss){

		B b = new B(100);
		System.out.println("i = "+b.i);
		System.out.println("j = "+b.j);
	}
}

class A{
	int i = 10;
	A(){
		System.out.println("default of A");
	}
	A(int i){
		this.i = i;
		System.out.println("A(int)");
	}
	
}

class B extends A{
	int j = 20;
	B(){
		System.out.println("default of B");
	}
	B(int j){
		this.j = j;
		System.out.println("B(int)");
	}
}