package Overloading;

public class Overloading3 {
    public void m1(Object o) {
        System.out.println("Object argument");
    }

    public void m1(String s) {
        System.out.println("String");
    }

    public static void main(String[] args) {
        Overloading3 obj = new Overloading3();
        obj.m1(new Object());
        obj.m1("String");
        obj.m1(null);// Here null is an object. When there is parent and child argument first priority goes to child.Here String is a child class of object class Hence,null will be treated as String.
    }

}
