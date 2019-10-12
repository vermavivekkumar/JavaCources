// Method Overloading
class L31P1{
	public static void main(String args[]){
		A a = new A();
		a.m1();
		a.m1("Hi");
		a.m1(4,4);
		a.m1(4);
		a.m1("hello",8);
		a.m1(8, "hello");
		
	}
}
class A{
	int i;
	int j;
	void m1(){
		System.out.println("1: m1()");
	}
	void m1(int i){
		System.out.println("2: m1(int)");
	}
	void m1(int i, int j){
		System.out.println("3: m1(int,int)");
	}
	void m1(int i, String j){
		System.out.println("5: m1(int,String)");
	}
	void m1(String i, int j){
		System.out.println("6: m1(String, int)");
	}
	void m1(String i){
		System.out.println("4: m1(String)");
	}
}