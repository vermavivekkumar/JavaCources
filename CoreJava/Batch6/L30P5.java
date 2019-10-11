class L30P5{
	public static void main(String args[]){
		System.out.println(1);
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
		
	}
}
class A{
	int i;
	int j;
	A(){
		i = 10;
		this("hi");/*
		Compilation error: call to this must be first statement in constructor
                this("hi");
                    ^
		*/
		System.out.println(3);
	}
	A(String s){
		i = 100;
		j = 200;
		System.out.println(4);
	}
	A(int j){
		this();
		this.j = j;
		System.out.println(2);
	}
}