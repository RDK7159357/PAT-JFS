package PAT2025SUB1.Pack1;

// class B is sub class of class A within the same package
public class B extends A{

    public void display(){
        //System.out.println(a); // N - private field not accessible
        System.out.println(b); // Y - package-private accessible
        System.out.println(c); // Y - protected accessible
        System.out.println(d); // Y - public accessible
    }
    
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
