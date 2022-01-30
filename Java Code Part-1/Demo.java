import java.util.Vector;

public class Demo
{
  public static void main(String args[]){

  Vector<Integer> vectorObject = new Vector<Integer>(4);

  vectorObject.add(3);

  vectorObject.add(5);

  vectorObject.add(4);

  vectorObject.add(1);

  System.out.println("Values in Vecor object" +vectorObject);

  vectorObject.addElement(2);

  System.out.println("Values in Vecor object" +vectorObject);

  }

}