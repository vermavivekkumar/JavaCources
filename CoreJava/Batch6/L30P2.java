class L30P2{
	public static void main(String args[]){
		A a = new A(20);
		System.out.println(a.i);
		System.out.println(a.j);
		
	}
}
class A{
	int i;
	int j;
	A(){
		i = 10;
	}
	A(String s){
		i = 100;
		j = 200;
	}
	A(int j){
		this();
		this.j = j;
	}
}