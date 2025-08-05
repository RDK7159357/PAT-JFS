package abstractclass;

class EP_factory {
   EP_factory() {
   }

   static Employee_Payroll getEmployee_Payroll(String var0) {
      if (var0.equalsIgnoreCase("Admin")) {
         return new adminEmpPayroll();
      } else if (var0.equalsIgnoreCase("Prod")) {
         return new prodEmpPayroll();
      } else if (var0.equalsIgnoreCase("Sales")) {
         return new salesEmpPayroll();
      } else {
         throw new IllegalArgumentException("Wrong type passed");
      }
   }
}
