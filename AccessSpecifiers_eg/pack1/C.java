package AccessSpecifiers_eg.pack1;

public class C {
    public void display(){
        A a = new A();
        // System.out.println(a.a); error fouund
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}
