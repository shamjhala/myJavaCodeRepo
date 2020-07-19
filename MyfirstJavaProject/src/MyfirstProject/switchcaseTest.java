package MyfirstProject;

public class switchcaseTest {
	
	    public static void main(String[] args) {

	        int age = 6;
	        String PlayGame;

	        // switch statement to check day
	        switch (age) {
	            case 1:
	                PlayGame = "Sometime";
	                break;
	            case 2:
	            	PlayGame = "with Mom";
	                break;
	            case 3:
	            	PlayGame= "with Dad";
	                break;

	            // match the value of week
	            case 4:
	            	PlayGame = "with Friends";
	                break;
	            case 5:
	            	PlayGame = "with school Friends";
	                break;
	           
	            default:
	            	PlayGame = "Invalid Choice";
	                break;
	        }
	        System.out.println("Play game choice  is  " + PlayGame);
	    }
	}


