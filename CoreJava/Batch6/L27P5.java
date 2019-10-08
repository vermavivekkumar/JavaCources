class L27P5{ // Problem: What is output?
	public static void main(String args[]){
		A a1 = new A(5);
		int[] a = {1,4};
		a1 = new A(a);
		System.out.println(a1.i);
		System.out.println(a1.j);
		a1 = new A("hi");
		System.out.println(a1.i);
		System.out.println(a1.j);
	}
}
class A{
	int i;
	int j;
	A(){}
	A(int k){System.out.println("in int cons");}
	A(String k){
		System.out.println("in String cons "+k);
		i = 100; 
		j = 200; 
	}
	A(int[] k){
		System.out.println("in int[] cons");
		i = k[1]; 
		j = k[0]; 
	}
}