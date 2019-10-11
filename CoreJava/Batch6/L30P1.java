class L30P1{ //Problem: How many object? How many dereferenced object? How many reference variable?
	public static void main(String args[]){
		A a = new A(40);
		System.out.println(a.i);
		System.out.println(a.j);
		A a0 = new A();
		System.out.println(a0.i);
		System.out.println(a0.j);
		
		A a1;
		a1 = a;
		a0 = a;
	}
}
class A{
	int i=5;
	int j;
	A(){
		i = 10;
	}
	A(int j){
		this.j = j;
	}
}