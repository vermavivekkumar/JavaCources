public class L24P7{	
	public static void main(String []ss){
		
		L24P7_1 ref;
		ref = new L24P7_1();
		
		System.out.println(ref.i);
		System.out.println(ref.j);

		ref.i = 5;
		ref.j = 10;
		
		System.out.println(ref.i);
		System.out.println(ref.j);
	
	}
}

class L24P7_1{
	int i;
	int j;
}
