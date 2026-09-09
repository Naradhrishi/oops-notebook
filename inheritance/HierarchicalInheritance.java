class Main{
    public static void main(String[] args) {
        Student  s = new Student("Rohit", 39, 10047);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.move();
        s.read();
        
        Labour  l = new Labour("Rahul", 29, 750.0f);
        System.out.println(l.getName());
        System.out.println(l.getAge());
        l.move();
        l.work();
    }
}

class Human{
    private String name;
    private int age;

    protected Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void move(){
        System.out.println("Human is moving...");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

class Student extends Human{
    int rollNum;

    Student(String name, int age, int rollNum){
        super(name, age);
        this.rollNum = rollNum;
    }

    public void read(){
        System.out.println("Student is reading...");
    }
}

class Labour extends Human{
    float wage;
    Labour(String name, int age, float wage){
        super(name, age);
        this.wage = wage;

    }

    public void work(){
        System.out.println("Labour is working...");
    }
}