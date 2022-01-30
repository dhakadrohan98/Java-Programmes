import java.util.Vector;  
public class VectorAddExample3 {    
    public static void main(String arg[]) {       
        //Create a Vector and add elements        
        Vector<String> vector = new Vector<>();       
        vector.add("A");          
        vector.add("B");          
        vector.add("C");                              
        vector.add(10,"H");   
        System.out.println("Elements in Vector : ");          
        for(int i=0; i < vector.size(); i++)   
            System.out.println("Element: "+vector.get(i));  
        }  
}  