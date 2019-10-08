class L27P6{ // Problem: What is output?
	public static void main(String args[]){
		int[] a = {1,4,6,9};
		A a1 = new A(a);
		a1 = new A(a1);
		System.out.println(a1.i);
		System.out.println(a1.j);
	}
}
class A{
	int i;
	int j;
	A(int[] k){
		i = k[3];
		j = k[2];
	}

	A(A a){
		i = a.j+10;
		j = a.i+1;
	}
}