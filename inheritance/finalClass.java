class Main{
    public static void main(String[] args) {
        ElectricCar roadster = new ElectricCar("Tesla" , 20000);
        roadster.getBrandName();
        /*
        OUTPUT:-
            finalClass.java:26: error: cannot inherit from final Car
            class ElectricCar extends Car{ // we can't extend/inherit Car class because that class has been defined as final class so extends is not allowed.
                                    ^
            1 error
            error: compilation failed
        */


    }
}

final class Car{ // if I remove this final keyword from this class then this code will work perfectly.
    protected String brand;

    Car(String brand){
        this.brand = brand;
    }
}

class ElectricCar extends Car{ // we can't extend/inherit Car class because that class has been defined as final class so extends is not allowed.
                               // any class which we don't wanna get inherited; we can define that class as final class so nobody can inherit it

    private int batteryMAH;

    ElectricCar(String brand, int batteryMAH){
        super(brand);
        this.batteryMAH = batteryMAH;
    }

    public void getBrandName(){
        System.out.println(this.brand);
    }
}