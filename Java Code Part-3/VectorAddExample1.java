import java.util.Vector;  
public class VectorAddExample1 {    
    public static void main(String arg[]) {  
        //Create an empty Vector with an initial capacity of 5        
          Vector<String> vc = new Vector(4);  
          //Add elements in the vector by using add() method  
          vc.add("A");  
          vc.add("B");  
          vc.add("C");  
          vc.add("D");  
          vc.add("E");  
          //Print all the elements of a Vector  
          System.out.println("--Elements of Vector are--");             
          for (String str : vc) {           
             System.out.println("Alphabet= " +str);  
          }  
      }  
}