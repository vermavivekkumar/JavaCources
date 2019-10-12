
class L31P4{
	public static void main(String args[]){
		new A(100,200).m2(4, new A(10,20));
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