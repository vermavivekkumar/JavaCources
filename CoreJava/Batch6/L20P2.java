class L20P2{
	public static void main(String args[]){
		
		
		int[] a = new int[5];
		System.out.println(a);
		
		for(int i=0; i<5; i++)
		System.out.println(a[i]);
	
		System.out.println("-------------");
		
		for(int hi=0; hi<5; hi++){
			a[hi] = hi+1;
		}

		for(int j=0; j<5; j++)
		System.out.println(a[j]);
		
	}
	
}