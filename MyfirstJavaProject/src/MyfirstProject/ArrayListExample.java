package MyfirstProject;
import java.util.ArrayList;
//The Collections framework is defined in the java.util package
class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);
    }
}