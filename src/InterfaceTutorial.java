///*In an interface by default is abstract and public. To give it an implementation in child class you have to declare
//it as public in child class. In child class each and every abstract method of interface should be implemented. If programmer
//can't give the implementation in the same class, class should be declared as abstract*/
//interface Vehicle{
//    void wheels();
//    void color();
//}
//abstract class service implements Vehicle{
//    public void Wheels(){
//        System.out.println("Implementation of Wheel method");
//    }
//}
//abstract class service1 implements Vehicle{
//    public void Wheels(){
//        System.out.println("Implementation of Wheel method");
//    }
//}
//
//public class InterfaceTutorial extends service{
//
//    public void color(){
//        System.out.println("Implementation of color method");
//    }
//
//    public static void main(String[] args) {
//        InterfaceTutorial interfaceTutorial=new InterfaceTutorial();
//        interfaceTutorial.wheels();
//        interfaceTutorial.color();
//    }
//
//}
