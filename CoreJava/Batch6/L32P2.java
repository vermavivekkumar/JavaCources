
class L32P2{
	public static void main(String args[]){
		A a1 = new A();
		A a2 = new A();
		
		a1.i = 100;
		a1.j = 200; // Not a correct way to access the static variable.. Why? It is a limited way of accessing a static variable.
		
		
		a2.i = 1000;
		a2.j = 13; // Not a correct way to access the static variable

		
		A.j = 50; // Correct way
		
		System.out.println("a1 ==> i = "+a1.i);
		System.out.println("a1 ==> j = "+a1.j);

		System.out.println("a2 ==> i = "+a2.i);
		System.out.println("a2 ==> j = "+a2.j);
	}
}
class A{
	int i;
	static int j;
}