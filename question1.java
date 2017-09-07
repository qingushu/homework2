import java.util.Scanner;
 
public class question1
{
	public static void main(String[] args)
        {
        	Scanner s = new Scanner(System.in);
 
        	System.out.println("How tall you want in your pyramid?");
 
        	int tall = s.nextInt();
 
        	System.out.println("Here Is Your Pyramid");
 
        	for (int i = 0; i < tall; i++)
        	{
 	    		for (int n = tall - i; n > 0; n--)
   	    		{
				System.out.print("   ");
	    		}
            		for (int j = 0; j <= i; j++)             
            		{
                		System.out.printf("%3d", 1 + j);
            		}
    	    		for (int m = i - 1; m >= 0; m--)
	    		{
				System.out.printf("%3d", 1 +  m);
	    		}
 
            		System.out.println();
        	}
    	}
}

