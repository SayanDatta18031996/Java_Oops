/*Protected method/variables can be accessible in other package's child class. but to get the data we have to create
only a child class's object. With parent class object we can't access*/

package pack3;
import pack2.B;

public class A extends B {
    public static void main(String[] args) {
        A a=new A();
        a.M1();
    }
}
