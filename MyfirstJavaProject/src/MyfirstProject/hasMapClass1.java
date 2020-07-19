package MyfirstProject;

import java.util.HashMap;
import java.util.Map;

public class hasMapClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());  	    
		    
		   }  */
		   
		
/*		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); //trying duplicate key  
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());   }  */
		 HashMap<Integer,String> map=new HashMap<Integer,String>();     
	    map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav");  
		    
		  //key-based removal  
		    map.remove(1);
		    System.out.println("Updated list of elements: "+map);  
		    //value-based removal  
		    map.remove(2);  
		    System.out.println("Updated list of elements: "+map);  
		    //key-value pair based removal  
		    map.remove(1, "Manggo");  
		    System.out.println("Updated list of elements: "+map);  
		   }  
		   
		   
		   
	

}
