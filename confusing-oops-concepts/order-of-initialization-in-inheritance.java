class Main{
    public static void main(String[] args) {
        // Parent obj = new Parent();
        /*
        OUTPUT : ( Parent ) -

        Parent static block
        Parent instance block
        Parent class constructor
        */

        /*

        [ JVM Loads Class ]
                │
                ▼
        1. Static Fields & Static Blocks (Executed once when class loads)
                │
                ▼
        [ Object is Created with 'new' ]
                │
                ▼
        2. Instance Fields & Instance Initializer Blocks (Executed every time)
                │
                ▼
        3. Constructor Body (Executed last)

        */


        new Child(); // creating object of Child class and let's see the output below : 
        
        // As u can see the output here ... as parent class loaded first that's why showing Parent static
        // then Child class get loaded so Child static and rest of the code Parent first then Child.
        /*
        OUTPUT : (Child extends Parent) -
        
        Parent static block
        Child static block
        Parent instance block
        Parent class constructor
        Child instance block
        Child constructor

        */



    }
}

class Parent{

    static{
        // this is static block .. which gets executed when a class is loaded
        // so among all 3, it gets executed first
        System.out.println("Parent static block");

    }

    {
        //  this is parent instance block
        // It gets executed after static block : Flow is - static -> instance -> constructor for Parent
        // which generally used for the removal of code duplication in constructors 
        // it runs every time we create an object of this class
        //  so we can handle operations like database authentication here instead of writing in multiple constructors

        System.out.println("Parent instance block");
    }


    // then constructors here
    Parent(){
        //  this gets executed to complete object creation at last after static -> instance block -> constructor
        System.out.println("Parent class constructor");

    }

}

class Child extends Parent{
    // In case of inheritance this order of initialization happens to the Parent first then come to Child
    static{
        System.out.println("Child static block");
    }

    {
        System.out.println("Child instance block");
    }

    Child(){
        System.out.println("Child constructor");

    }
}