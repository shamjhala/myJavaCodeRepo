package MyfirstProject;

public class copyArray {
	
	public static void main(String[] args) {
	       
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays
        
       

        for (int number: positiveNumbers) {
            System.out.println(number + ", ");
        }
        
        int [] Changenumbers = {-1, 2, 3, 4, 5, 6};
        int [] ChangepositiveNumbers = Changenumbers;    // copying arrays
      
        // change value of first array
        Changenumbers[0] = -1;

        // printing the second array
        for (int  Changenumber: ChangepositiveNumbers) {
            System.out.print(Changenumber + ", ");
        }
    }
        
        
        
    

}
