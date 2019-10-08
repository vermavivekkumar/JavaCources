class L27P2{
	public static void main(String args[]){
		A a = new A();
		
		System.out.println(a.i);
		System.out.println(a.j);

		A a1 = new A(105);
		
		System.out.println(a1.i);
		System.out.println(a1.j);		
	}
}

class A{
	int i=5;
	int j;
	
	A(){
		i = 100;
		j = 200;
		System.out.println("In 1st constructor");
	}
	
	A(int k){ 
		i = 1000;
		j = 2000;
		System.out.println("In 2nd constructor");		
	}
}