class L20P3{
	public static void main(String args[]){
		
		
		int[][] a = new int[2][];
		
		for(int j=0; j<2; j++)
		System.out.println(a[j]);
	
		System.out.println("------------");
		a[0] = new int[3];
		
		a[1] = new int[4];
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		
		a[1][0] = 100;
		a[1][1] = 200;
		a[1][2] = 300;
		a[1][3] = 400;
		
		for(int j=0; j<4; j++)
		System.out.println(a[1][j]);
	
		System.out.println("------------");
		
		for(int j=0; j<3; j++)
		System.out.println(a[0][j]);
		
		System.out.println("------------");

		for(int j=0; j<2; j++)
		System.out.println(a[j]);
		
		System.out.println("------------");
		
		System.out.println(a);
	}
	
}