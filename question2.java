import java.util.Scanner;

public class question2{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("which year are you looking for?");
		int year = s.nextInt();
		System.out.print("what day the first of January fell on?");
		int date = s.nextInt();
		
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
		};
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		if((year % 4 == 0) && (year % 100 != 0))
		{
			days[2] = 29;
		}
		for(int i = 1; i <= 12; i++)
		{
			System.out.println("    " + months[i] + "  " + year);
			System.out.println("  S  M  Tu W  Th F Sa");
			for(int j = 0; j < date; j++)
				System.out.print("   ");
			for(int m = 1; m <= days[i]; m++){
				System.out.printf("%3d", m);
				if(((m + date) % 7 == 0 ))
					System.out.println();
				if(m == days[i]){	
					date = (m + date) % 7;
					System.out.println();
				}
			}
		
		}
		
				
	}
}
 
