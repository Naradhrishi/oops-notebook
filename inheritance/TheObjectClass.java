class Main{
    public static void main(String[] args) {
        Car obj = new Car("Tata", "White");
        obj.display(); // till here everything is fine but what will happen if I call a method toString() using this obj

        String objectString = obj.toString(); // we are calling a method which has not been defied in Car class, let's see
        System.out.println(objectString); 
        /*
        OUTPUT :-
            Tata  White
            Car@64d7f7e0
        */
       // how we are getting this output even after not having toString() method in Car class
       // what happens actually is that every class we create in Java implicitly inherits/extends `Object` class which is the ultimate parent class of every class/object
       // and Object class has all  these methods like - clone(), toString(), hashCode(), getClass(), equals() etc.. that's why we are able to use them in every class object that we have created.


    }
}

// I have made a normal Car class here which has just two properties and one method display which shows brand name and color

class Car{
    String brand;
    String color;

    Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public void display(){
        System.out.println(this.brand + "  "+ this.color);

    }
}

