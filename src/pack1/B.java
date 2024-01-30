/*Protected method/variables can be accessible within the same packages or in other packages child class.
If we extend a parent class to child class we can access that class by Parent class references, child class
reference and Parent class which can hold child references */
package pack1;

class A{
    protected void m1(){
        System.out.println("Class A private method");
    }
}
public class B extends A{
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        B b=new B();
        b.m1();
        A aa=new B();
        aa.m1();
    }
}
