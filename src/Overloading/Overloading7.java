package Overloading;

class Animal {}
class Monkey extends Animal {}
public class Overloading7 {
    public void m1(Animal animal){
        System.out.println("Animal version");
    }
    public void m2(Monkey monkey){
        System.out.println("Monkey Version");
    }
    public static void main(String[] args) {
        Overloading7 o= new Overloading7();
        Animal a = new Animal();
        o.m1(a);
        Monkey m = new Monkey();
        o.m2(m);
        Animal a1= new Monkey();
        o.m1(a1);

    }
    
}
