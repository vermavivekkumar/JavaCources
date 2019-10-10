class L29P7{
	public static void main(String args[]){
		A a = new A(40);
		System.out.println(a.i);
		System.out.println(a.j);
		a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
class A{
	int i=5;
	int j;
	A(){
		i = 10;
	}
	A(int j){
		this.j = j;
	}
}