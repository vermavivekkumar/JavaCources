
class L31P3{
	public static void main(String args[]){
		A a = new A(100,200);
		A a1 = new A(10,20);
		a.m2(4, a1);
	}
}
class A{
	int i;
	int j;
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	void m2(int i,A a){
		a.m3();
	}
	void m3(){
		System.out.println(i);
		System.out.println(j);
	}
	
}