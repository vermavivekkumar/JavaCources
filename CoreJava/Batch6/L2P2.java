// Identifierss
class L2P2{
	public static void main(String[] ss){
		int xyz; //valid identifier
		int $str; //valid identifier
		
		//int 1test; // not valid --- Rule 2

		int ______________; // valid
		
		int ___________________________________________________________________________________________; // valid -- rule 3
		int this_is_a_very_long_name_for_identifier; // valid -- rule 3
		
		
		//int class; // not valid  --  Rule 4
		
		int count; // valid
		int Count;// valid   Rule 5
		int COunt;// valid
		
		
		int String; // valid Rule no : 6
		int Object; // valid Rule no : 6
		
		System.out.println("Hi!");
	} 
}