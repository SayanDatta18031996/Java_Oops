package Overloading;

public class Overloading1 {
    public void m1(){
        System.out.println("No argument");
    }
    public void m1(int i){
        System.out.println("integer");
    }
    public void m1(float f){
        System.out.println("float");
    }
    public void m1(double d){
        System.out.println("double");
    }
    public void m1(char c){
        System.out.println("Character");
    }public void m1(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        Overloading1 obj = new Overloading1();
        obj.m1();
        obj.m1(10);
        obj.m1(10.5f);
        obj.m1(10d);
        obj.m1('C');
        obj.m1("S");
    }

}
