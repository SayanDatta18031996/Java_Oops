package Overloading;

public class Overloading4 {
    public void m1(StringBuffer sb) {
        System.out.println("Object argument");
    }

    public void m1(String s) {
        System.out.println("String");
    }

    public static void main(String[] args) {
        Overloading4 obj = new Overloading4();
        obj.m1(new StringBuffer("StringBuffer"));
        obj.m1("String");
        //obj.m1(null);// Here null is an object. When there is no parent/child classes for argument and two different classes of argument is there compiler can't decide where to assign the argument. Hence, It will be a compiler error.
    }

}
