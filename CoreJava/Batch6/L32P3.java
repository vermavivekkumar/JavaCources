
class L32P3{
	public static void main(String args[]){
		
		A.j = 50; // Correct way
		
		System.out.println("A ==> j = "+A.j);
	}
}
class A{
	int i;
	static int j;
}