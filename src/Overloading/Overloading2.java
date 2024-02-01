package Overloading;

public class Overloading2 {
    public void m1(){
        System.out.println("No argument");
    }
    public void m1(int i){
        System.out.println("integer");
    }
    public void m1(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        Overloading2 obj = new Overloading2();
        obj.m1(10);
        //obj.m1(10.5f)// From this example, it is proven that Automatic Type Promotion is only applicable from small size datatype to big size datatype. As the double size is large when compared to integer so large size to small size conversion fails.
        obj.m1('C');// And as Char can be promoted to int. here it promoted.
    }

}
