class L28P2{
	public static void main(String args[]){
		A a = new A(40,50);
		
		System.out.println(a.i);
		System.out.println(a.j);

	}
}

class A{
	int i=5;
	int j;
		
	A(int l, int m){
		i = l;
		j = m;
	}
}