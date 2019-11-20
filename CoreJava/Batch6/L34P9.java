class L34P9{

	public static void main(String[] ss){

		new A(10);
		new A(100);
	}
}

class A{

	static
	{
		System.out.println("In static block 1");
	}

	int i;

	A(int i){
		this.i = i;
		System.out.println("In Constructor "+i);
	}	

	static
	{
		System.out.println("In static block 2");
	}
	
	{
		System.out.println("In Anonymous block "+i);
	}

	static
	{
		System.out.println("In static block 3");
	}
}

