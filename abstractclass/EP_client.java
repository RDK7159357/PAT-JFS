package abstractclass;

class EP_client {
   EP_client() {
   }

   public static void main(String[] var0) {
      String var1 = var0[0];
      int var2 = Integer.parseInt(var0[1]);
      Employee_Payroll var3 = EP_factory.getEmployee_Payroll(var1);
      double var4 = var3.CalcSalary(var2);
      System.out.println("Emp type " + var1 + " Emp id " + var2 + " salary " + var4);
   }
}
//ramadugudhanush@Ramadugus-MacBook-Pro PAT JFS % javac abstractclass/*.java
// ramadugudhanush@Ramadugus-MacBook-Pro PAT JFS % java -cp . abstractclass.EP_client Sales 106
// Sales Emp Payroll
// Emp type Sales Emp id 106 salary 100.0