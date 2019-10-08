class L27P1{
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
	
	A(){ /*Compilation Error: L27P1.java:21: error: constructor A() is already defined in class A
        A(){
        ^*/
		i = 1000;
		j = 2000;
		System.out.println("In 2nd constructor");		
	}
}