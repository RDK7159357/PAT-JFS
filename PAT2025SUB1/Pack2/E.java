package PAT2025SUB1.Pack2;
import PAT2025SUB1.Pack1.A;

public class E {
    public void display(){
        A obj = new A(); // Create an instance of A
        
        // System.out.println(obj.a); // N - private, not accessible
        // System.out.println(obj.b); // N - package-private, not accessible from different package
        // System.out.println(obj.c); // N - protected, not accessible through instance from different package
        System.out.println(obj.d); // Y - public, accessible everywhere
    }
    
    public static void main(String args[]){
        E ob = new E();
        ob.display();
    }
}
