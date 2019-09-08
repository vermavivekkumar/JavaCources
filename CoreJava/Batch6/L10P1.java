class L10P1{ // Assignment Operator
	public static void main(String[] ss){
		
		int i;
		i =10; // Here '=' is Assignment Operator and copy righthand value in to lefthand variable		
		System.out.println(i);
		
		int j;
		j = 15;
		System.out.println(j);
		
		j = i; // Copy by value : Here '=', copy righthand variable's value (i's value) in to lefthand variable j. Hence, now both variable will have same value ie 10
		System.out.println(j);
		
	}
}