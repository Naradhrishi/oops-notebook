class Main{
    public static void main(String[] args) {
        Student ramesh = new Student("Ramesh", 25, "Black", 251011750, 94.2f);
        float result = ramesh.getPercentage();
        ramesh.read();
        System.out.println("Percentage : " + result);
        
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


class Student extends Human{
    private int rollNumber;
    private float percentage;

    // all constructors of Student class
    public Student(String name){
        super(name);
    }

    public Student(String name, int age){
        super(name, age);

    }

    public Student(String name, int age, String hairColor){
        super(name, age, hairColor);

    }

    public Student(String name, int age, String hairColor, int rollNumber){
        super(name, age, hairColor);
        this.rollNumber = rollNumber;
    }

    public Student(String name, int age, String hairColor, int rollNumber, float percentage){
        super(name, age, hairColor);
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }


    // methods / behaviors of Student
    public float getPercentage(){
        return this.percentage;
    }

    public void read(){
        System.out.println(this.name + " is Reading...");

    }

}