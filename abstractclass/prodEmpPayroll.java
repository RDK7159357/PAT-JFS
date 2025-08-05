package abstractclass;

class prodEmpPayroll extends Employee_Payroll {
   prodEmpPayroll() {
   }

   public double CalcSalary(int var1) {
      System.out.println("Production Emp Payroll");
      return 1000.0;
   }
}