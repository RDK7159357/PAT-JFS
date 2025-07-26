package PAT2025SUB1.Pack2;
import PAT2025SUB1.Pack1.A;

public class D extends A {
    public void display(){
        // System.out.println(a); // N - private, not accessible even in subclass
        // System.out.println(b); // N - package-private, not accessible from different package
        System.out.println(c); // Y - protected, accessible in subclass
        System.out.println(d); // Y - public, accessible everywhere
    }
    public static void main(String args[]){
        D ob = new D();
        ob.display();
    }
}
