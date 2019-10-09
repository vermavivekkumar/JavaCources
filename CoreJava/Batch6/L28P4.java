class L28P4{// Problem: What is output?
	public static void main(String args[]){
		A a = new A(40,50);
		
		System.out.println(a.i);
		System.out.println(a.j);

	}
}

class A{
	int i=5;
	int j;
		
	A(int i, int j){
		System.out.println(i);
		System.out.println(j);
		i = 500;
		j = 1000;
		System.out.println(i);
		System.out.println(j);
	}
}