class L34P7{

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

	static
	{
		System.out.println("In static block");
	}
}

