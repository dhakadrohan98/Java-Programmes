//	package supercall;

public class Main {

    public static void main(String[] args) {
        SomeClass obj = new SubClass();
        obj.go();   //is there anything like, obj.super.go()?
    }

}

class SomeClass {
    SomeClass() {

    }
    public void go() {
        System.out.println("Someclass go");
    }
}

class SubClass extends SomeClass {
    SubClass() {

    }
    @Override
    public void go() {
        System.out.println("Subclass go");
    }
}