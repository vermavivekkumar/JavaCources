//Problem: We want to call any parameterize constructor of class A while creating the object of class B 
// Solution: 'super' keyword
class L35P4{

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
		super(50);
		this.j = j;
		System.out.println("B(int)");
	}
}