// What is the output?
class L34P6{

	public static void main(String[] ss){

		new A(10);
		new A(100);
	}
}

class A{

	int i;

	A(int i){
		this.i = i;
		System.out.println("In Constructor "+i);
	}	
	
	{
		System.out.println("In Anonymous block "+i);
	}
}

