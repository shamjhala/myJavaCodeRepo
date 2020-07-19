package MyfirstProject;

public class arrayExample {
	
	 public static void main(String args[])
	    {
	    
		 try
		 {
		 int a[] = new int[5];
		 //int a[] = {10,2,4,5,20}
		 
		// "Some where in heap space created " and value of this space is 0 
		 
	//	 0 0 0 0 0
		 
		 a[0]= 10;
		 a[1]=2;
		 a[2]=4;
		 a[3]=5;
		 a[4]=20;
		 a[5] = 34;
		 
		 System.out.print("First Element " +a[5]);
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 
		 }
		 
	    }

}
