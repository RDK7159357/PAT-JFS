package AccessSpecifiers_eg.pack1;

// class B is sub class of class A within the same package
public class B extends A{
    private static final char[] a = null; // avoid error

    public void display(){
        System.out.println(a); // N
        System.out.println(b); // Y
        System.out.println(c); // Y
        System.out.println(d); // Y
    }
    
}
