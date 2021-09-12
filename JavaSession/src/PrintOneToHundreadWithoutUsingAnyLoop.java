import java.util.stream.IntStream;

public class PrintOneToHundreadWithoutUsingAnyLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 method Java streams
		
		IntStream.range(1,101).forEach(e ->System.out.println(e));

		//1Recursive function :The Function it self
		
		printnum(2);
		
	}
	
	public static void printnum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printnum(num);
		}
	}

}
