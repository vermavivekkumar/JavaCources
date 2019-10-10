class L29P6{// Problem: What is output?
	public static void main(String args[]){
		A a = new A(40,50);
		a.m1(7);
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
class A{
	int i=5;
	int j;	
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	void m1(int i){
		this.i = m3(i);
		j = m3(i+i);
	}		
	int m3(int i){
		if(i > 10){
			return 100;
		}else{
			return 200;
		}
	}
}