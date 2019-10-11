class L30P4{
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
		this("hi");
		i = 10;
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