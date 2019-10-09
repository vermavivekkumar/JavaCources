class L28P3{// Problem: What is output?
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
		i = i;
		j = j;
	}
}