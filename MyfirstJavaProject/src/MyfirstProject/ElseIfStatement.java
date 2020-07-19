package MyfirstProject;


	
	// Example for Java Else If Statement

	

	import java.util.Scanner;

	public class ElseIfStatement {
		private static Scanner sc;
		
		public static void main(String[] args) {
			int totalmarks;
			sc = new Scanner(System.in);		
			//Imagine you have 6 subjects and Grand total is 600 
			System.out.println(" Please Enter your Total Marks: ");
			totalmarks = sc.nextInt();
			
			if (totalmarks >= 540) {
				System.out.println("Congratulations"); 
				System.out.println("You are eligible for Full Scholarship");
			}
			else if (totalmarks >= 480)  {
				System.out.println("Congratulations"); 
				System.out.println("You are eligible for 50 Percent Scholarship");
			}
			else if (totalmarks >= 400)  {
				System.out.println("Congratulations"); 
				System.out.println("You are eligible for 10 Percent Scholarship");
			}
			else  {
				System.out.println("You are Not eligible for Scholarship"); 
				System.out.println("We are really Sorry for You");
			}
		}
	}


