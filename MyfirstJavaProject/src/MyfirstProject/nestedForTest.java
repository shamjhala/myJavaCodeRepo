package MyfirstProject;
import java.util.Scanner;
class nestedForTest
{
    public static void main(String args[])
    {
       int  i,j;
       //To get the user's input
    //   @SuppressWarnings("resource")
//	Scanner input = new Scanner(System.in);
   //    System.out.println("Enter the number of rows you want to print:");
       //Copying user input into an integer variable named rows
    //   rows = input.nextInt();
      // System.out.println("****************");
       for ( i = 1 ; i <=4 ; i++ )
       {
           for ( j = 1 ; j <=4 ; j++ )
           {
               
        	  // System.out.print(" + ");
                //Incrementing the number value
              //  number++;
           
           //For new line
           if(i==1 || i==4 || j==1 || j==4)
           {
        	   System.out.print(" 1 "); 
           }
           else
           {
        	   System.out.print("   "); 
           }
         
           }

           System.out.println( );
       }
       
     
       
   }
}
