package MyfirstProject;

import java.util.Scanner;

class scannerClass 
{
  public static void main(String[] args) {
	  int num;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    num = input.nextInt();

	   //  If number is divisible by 2 then it's an even number
	     // else odd number
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	//  }
  
  String name ;
  int a = 10;
  Scanner myObj = new Scanner(System.in);
   name = myObj.nextLine();
  
  if(name == "Samina")
  {
	   System.out.println("Correct Name"); 
  }
  
  else
  {
	   System.out.println("Incorrect Name");
  }
	  
  }
  
 
  
}
    
 


