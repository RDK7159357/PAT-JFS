package PAT2025SUB1.Pack1;

public class C {
    public void print() {
    // Classname objRef=new ClassConstructor();
    A a=new A();
     //System.out.println(a.a); // N
    System.out.println(a.b); // Y
    System.out.println(a.c); // Y
    System.out.println(a.d); // Y
  }
  public static void main(String [] args){
    C obj = new C();
    obj.print();
  }
}
