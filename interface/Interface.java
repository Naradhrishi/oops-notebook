class Main{
    public static void main(String[] args) {
        LaserPrinter l = new LaserPrinter();
        JetPrinter j = new JetPrinter();
        j.print();
        l.print();
        System.out.println(l.STATE_IDLE);
    }
}

interface Printer{ // we can't create the object of this interface directly, we must have to implement this in any class then only we can create objects
    int STATE_IDLE = 1; // this method is by default public static final and we can't change that.
    // still if we try to do and check that we will get this kind of error
    /*
        interface.java:12: error: modifier protected not allowed here
        protected int STATE_IDLE = 1; // this method is by default public static final and we can't change that.
                        ^
        1 error
        error: compilation failed
    */

    void print(); // this method is by default an abstract method even after there is no keyword abstract written
    // because inside an interface all default methods are abstract method.
}
// Interface allow us to do multiple inheritance in java which is not possible using inheritance, will see that code in another program.


// in order to implement the Printer interface, we must have to implement all the abstract methods of Printer interface otherwise will get error.
class JetPrinter implements Printer{
    @Override
    public void print(){
        System.out.println("Printing using jet printer");

    }
}

class LaserPrinter implements Printer{
    @Override 
    public void print(){
        System.out.println("Printing using LASER printer");
    }
}


/*

🔑 Key Characteristics

• Methods: By default, all methods are implicitly public and abstract (they have no body).
• Variables: Any fields declared inside an interface are implicitly public, static, and final (constants).
• No Instantiation: You cannot create an object (instance) of an interface using the new keyword.
• Keywords: An interface is defined using the interface keyword and implemented by a class using the implements keyword.

⚙️ Why Do We Need Interfaces?

1. Abstraction: It hides implementation details and only exposes the signature/contract to the user.
2. Multiple Inheritance: Java classes cannot inherit from more than one class to avoid ambiguity (the Diamond Problem). However, a class can implement multiple interfaces at the same time.
3. Loose Coupling: It breaks dependencies between components, allowing you to swap out implementations without breaking the system.

*/