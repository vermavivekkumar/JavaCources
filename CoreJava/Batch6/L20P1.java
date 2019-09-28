class L20P1{
	public static void main(String args[]){
		System.out.println("Hello World!");
		
		int[] a;
		a = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int[] b;
		
		b = a;
		
		b[2] = 100;
		
		
		for(int i=0; i<5; i++)
		System.out.println(a[i]);
	}
	
}