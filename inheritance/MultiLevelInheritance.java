class Main{
    public static void main(String[] args) {
        Student obj = new Student(true, 20, "Rohan", 2510234);
        obj.goToSchool();
        obj.move();
        System.out.println("isAlive = " + obj.isAlive);
        obj.showName();

    }
}

class Animal{
    boolean isAlive;
    int age;

    public Animal(boolean isAlive, int age){
        this.isAlive = isAlive;
        this.age = age;
    }

    public void move(){
        System.out.println("Animal is moving...");

    }
}

class Human extends Animal{
    String name;

    public Human(boolean isAlive, int age, String name){
        this.name = name;
        super(isAlive, age); // we must have to write super first inside this constructor other
        // if I put this super after this.name line then it would not work. super always comes first as first line in subclass constructor if we need to call parent class constuctor then.
        /*
        RULE CHANGED AFTER JAVA 22+ :-
        Now what is extra in Java 22+ ?

        Before Java 22, this was the rule:
        super() MUST be line number 1. Nothing before it.

        Since Java 22, they allowed code BEFORE super() - but only code that does NOT need this.

        ---------------------

        Old Java: super() must be first line, no compromise.
        New Java 22+: You can do calculations and validation before super(), you just can't use the object itself before its parent is created.
                
        */
    }

    public void speak(){
        System.out.println("Human is speaking some language...");

    }
}

class Student extends Human{
    int rollNumber;

    public Student(boolean isAlive, int age, String name, int rollNumber){
        super(isAlive, age, name);
        this.rollNumber = rollNumber;
    }

    public void goToSchool(){
        System.out.println("Student is going to school...");

    }

    public void showName(){
        System.out.println(super.name); // but we can't do super.super.age because super is not an object, just a keyword.

    }

}