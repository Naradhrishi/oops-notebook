class Main{
    public static void main(String[] args) {
        Human obj =  new Human("Raju", 20, "Brown");
        obj.eat();
        System.out.println("Age : "+obj.age);
        System.out.println("Hair color : "+obj.hairColor);
    }
}

class Human{
    String name;
    int age;
    String hairColor;

    // Learning : Constructors do not use have return type
    // Learning : Java only creates a hidden, default no-argument constructor (public Human() {}) if you write a class with zero constructors.

    // constructor which takes only name
    public Human(String name){
        this.name = name;
    }
    // constructor which takes only name and age
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    // constructor which takes only name, age and hairColor as well
    public Human(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;

    }


    // behaviors of Human class
    public void eat(){
        System.out.println(this.name + " is eating...");

    }

}