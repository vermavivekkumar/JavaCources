class L14P5{ // switch case statement for int expression with break
		
	public static void main(String[] ss){
		
		int value;
		
		value  = 16;
		
		switch(value/2){ // Here 'value/2' is a int expression
			case 4:
			System.out.println("4");
			break;
			case 5:
			System.out.println("5");
			break;
			case 6:
			System.out.println("6");
			break;
			case 7:
			System.out.println("7");
			break;
			default: // It execute when no case match
			System.out.println("default");
		}
	}
}