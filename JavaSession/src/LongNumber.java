
public class LongNumber {

	public static void main(String[] args) {
		// what will be the output when you use a number with L and without L suffix
		
      long LongNumberWithoutL= 1000*60*60*24*365;
      System.out.println(LongNumberWithoutL); //1471228928
      
      long LongNumberWith= 1000*60*60*24*365L;
      System.out.println(LongNumberWith);//3153600000
      
      //3153600000 --36 bits
      
      //10111011111110000001111000000000 - 36 Bit representation of binary
      
      //Max limit for int : 2147483647
      
      //so java will do that : java will truncate the initial first four digit will remove :
      //1011111110000001111000000000 - 32 bit representation of binary
	}

}
