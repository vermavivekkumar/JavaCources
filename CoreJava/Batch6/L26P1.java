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
		System.out.println("In constructor");
	}
}