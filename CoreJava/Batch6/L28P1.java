/*
L28P1.java:3: error: constructor A in class A cannot be applied to given types;
                A a = new A();
                      ^
  required: int,int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

*/

class L28P1{
	public static void main(String args[]){
		A a = new A();
		
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
		System.out.println("In 2nd constructor");		
	}
}