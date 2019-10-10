class L29P5{// Problem: What is output?
	public static void main(String args[]){
		A a = new A(40,50);
		
		a.m1(30);
		
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
	
	void m1(int i){
		this.i = i;
		j = i+i;
	}
}