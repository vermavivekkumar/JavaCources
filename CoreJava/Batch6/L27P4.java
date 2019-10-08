class L27P4{
	public static void main(String args[]){
		A a1 = new A(5);
		int[] a = {1,4};
		A a2 = new A(a);
		A a3 = new A();
		A a4 = new A("hi");
	}
}

class A{
	A(){}
	A(int k){System.out.println("in int cons");}
	A(String k){System.out.println("in String cons "+k);}
	A(int[] k){System.out.println("in int[] cons");}
}