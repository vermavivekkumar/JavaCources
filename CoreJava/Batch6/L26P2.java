class L26P1{
	public static void main(String args[]){
		A a = new A();
		
		System.out.println(a.i);
		System.out.println(a.j);
		

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
	
	A(){
		i = 1000;
		j = 2000;
		System.out.println("In 2nd constructor");		
	}
}