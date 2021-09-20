
public class Test {

	public static void main(String[] args) {
		
		System.out.println(Main.x);

	}
	
//question : main method will be calling to main.x so it will print 100 before that it will call 
//static block also because you know the property of static block
//static block property : It will be loaded before the main method but we don't have any method 
//is over here but this variable is actually declare is final .so this case what will be the output 
	
	
	

}
class Main {
	public static final int x=100;
	
	static {
		System.out.println("Main -class static block");
	}
}

//Answer: Because this particular variable is taking is final  what exactly java will do that to improve the performance the Main.x is actually replaces
//inside the dot class file .inside the byte code it will be represented by 100 only (xvalue) 
//it means it will directly take the value for x from here . so it will not write Main.X internally
//but if you are remove the final keyword then static block is executed



