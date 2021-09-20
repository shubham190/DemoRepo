
public class NullArgument {
// pass null argument with method overloading with string object types
//so which mtd will call the program

	public static void main(String[] args) {
		test(null);

	}

	public static void test(Object O)
	{
		System.out.println("object argument");
	}
	
	public static void test(String s)
	{
		System.out.println("String argument");
	}
	



}


//Answer : string argument call the program first because it is the most obvious data type is 
//string so string argument print first 
//data type 
