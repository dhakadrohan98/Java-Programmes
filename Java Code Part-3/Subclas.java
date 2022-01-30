// program not runned successfully.

public class Superclass {

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}
Here is a subclass, called Subclass, that overrides printMethod():

public class Subclas extends Superclass {

    // overrides printMethod in Superclas
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclas");
    }
    public static void main(String[] args) {
        Subclas s = new Subclas();
        s.printMethod();    
    }
}