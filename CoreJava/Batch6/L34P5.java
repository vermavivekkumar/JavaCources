// What is the output?
class L34P5{

	public static void main(String[] ss){

		new A(10);
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

