class L29P2{
	public static void main(String args[]){
		A a = new A(40,50);
		
		a.m1();
		
		System.out.println(a.i);
		System.out.println(a.j);

	}
}

class A{
	int i=5;
	int j;
		
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	void m1(){
		i = 10;
		System.out.println("Hi! in method m1()");
	}
}