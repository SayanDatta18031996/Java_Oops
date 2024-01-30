/*If we extend the abstract method to any subclass compulsorily all the abstract methods in parent abstract class
must be implemented  by the subclass or else that subclass must be declared as abstract. you can implement rest of
the method in another child class*/

abstract class Vehicle1 {
    abstract int noOfWheels();

    abstract String colorOfVehicle();
}

abstract class busWheel extends Vehicle1 {
    int noOfWheels() {
        return 6;
    }
}

class busColor extends busWheel {
    String colorOfVehicle() {
        return "red";
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        busColor b = new busColor();
        System.out.println("bus wheel: " + b.noOfWheels());
        System.out.println("bus color: " + b.colorOfVehicle());
    }
}
