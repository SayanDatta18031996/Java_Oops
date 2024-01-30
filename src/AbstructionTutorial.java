abstract class Vehicale{
    abstract void start();
}

class Car extends Vehicale{
    void start() {
        System.out.println("Car start");
    }
}

class Scooter extends Vehicale{
    void start() {
        System.out.println("Scooter start");
    }
}
public class AbstructionTutorial {
    public static void main(String[] args) {
    Car c=new Car();
    c.start();
    Scooter s=new Scooter();
    s.start();
    }
}
