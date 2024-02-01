package Overloading;

public class Overloading6 {
    public void m1(int i) {
        System.out.println("Genaral Method");
    }

    public void m1(int ... i) {
        System.out.println("Var-args method");
    }

    public static void main(String[] args) {
        Overloading6 obj = new Overloading6();
        obj.m1();//Var-args method as it can take 0 to n number of method
        obj.m1(10,20);// Var-args method as 1st method is not matching and Var-args can 
        obj.m1(10);//Genaral method. Here both the method is  satisfied but as Genaral method came on java 1.0 and Var-args method came in 1.5. Old concept got the precedence. 
    }
    
}
