package Overridding;

class Animal{
    public void name(){
        System.out.println("Animal Name");
    }
    public void color(){
        System.out.println("Animal color");
    }
}

class Dog extends Animal{
    public void name(){
        System.out.println("Dog name");
    }
}
public class Overridding1 {
public static void main(String[] args) {
   Animal a= new Animal();
   a.name();
   Dog d= new Dog();
   d.name();
   Animal a1=new Dog();// Run time obect always gets prefferecnce in overrinding. Hence, When in run time JVM found a overrriding method it will give chance to child method.
   a1.name();
}
}