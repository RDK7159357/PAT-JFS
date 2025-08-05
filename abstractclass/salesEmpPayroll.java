package abstractclass;

class salesEmpPayroll extends Employee_Payroll {
   salesEmpPayroll() {
   }

   public double CalcSalary(int var1) {
      System.out.println("Sales Emp Payroll");
      return 100.0;
   }
}
