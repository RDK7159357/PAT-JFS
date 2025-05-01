package AccessSpecifiers_eg.pack2;
import AccessSpecifiers_eg.pack1.A;
public class E extends A {
    public void display(){
        // System.out.println(a); // N  error
        // System.out.println(b); // N error
        System.out.println(c); // Y
        System.out.println(d); // Y
    }
    
}
