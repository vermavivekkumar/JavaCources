
class L31P2{
	public static void main(String args[]){
		A a = new A();
		a.m1(4);
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
		m1(4,5);
	}
	void m1(int i, int j){
		System.out.println("3: m1(int,int)");
	}
	
}