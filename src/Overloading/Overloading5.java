package Overloading;

public class Overloading5 {
    public void m1(int i, float f) {
        System.out.println("int&float");
    }

    public void m1(float f, int i) {
        System.out.println("floatint");
    }
    public static void main(String[] args) {
        Overloading5 obj = new Overloading5();
        obj.m1(10, 10.5f);// will call the 1st method
        obj.m1(10.5f,10);//will call the 2nd method
        // Both above methods are overloaded menthod as agruements are same type but order is different. 
    }
}
