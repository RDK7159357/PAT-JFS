package AccessSpecifiers_eg.pack2;
import AccessSpecifiers_eg.pack1.A;


public class F {
    A a = new A();
    public void display(){

        // System.out.println(a.a); // N
        // System.out.println(a.b); // N
        // System.out.println(a.c); // N (protected does not allow as F is not a subclass of A)  errors
        System.out.println(a.d); // Y
    }
    
}
