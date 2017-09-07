import java.util.Scanner;
import java.util.ArrayList;
public class question5{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		s.useDelimiter(",");
		System.out.println("please enter any value you like and seperate them with comma");
		while(s.hasNext()){
			System.out.println(s.next());
		}
		
		
	}
}
 
