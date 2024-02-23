package Overridding;

class class1 {
    private void m1(){
        System.out.println("Private method of class 1");
    }
}

class class2 extends class1{
    private void m1(){
        System.out.println("Private method of class 2");
    }
}
// Here in both the class method name and signature is same but it's not overridding. Both the private method is there own class there is no relation between both the method as private metod is not accessable from the out side of the class.Both the private method are internal methods of their own class.
public class Overridding2 {
public static void main(String[] args) {
    class1 obj=new class2();
    //obj.m1(); can't access as private method can't access outside of the class.
}
    
}
