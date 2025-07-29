package abstract_class;

//  class Employee_Payroll{

//      double CalcSalary(int eid); // missing method body, or declare abstract;

// }
//  class Employee_Payroll{

//      abstract double CalcSalary(int eid); // Employee_Payroll is not abstract and does not override abstract method CalcSalary(int) in Employee_Payroll

// }

// class adminEmpPayroll extends Employee_Payroll{
//     private double CalcSalary(int eid) { // Cannot reduce the visibility of the inherited method from Employee_Payroll
//       return 0;
//     }
// }

abstract class Employee_Payroll {

    abstract double CalcSalary(int eid);

}

class adminEmpPayroll extends Employee_Payroll {
    public double CalcSalary(int eid) {

        System.out.println("Admin Emp Payroll");
        return 0;
    }

}

class salesEmpPayroll extends Employee_Payroll {
    public double CalcSalary(int eid) {
        System.out.println("Sales Emp Payroll");
        return 100;
    }
}
class prodEmpPayroll extends Employee_Payroll {
    public double CalcSalary(int eid) {
        System.out.println("Production Emp Payroll");
        return 1000;
    }
}


// Factory class

class EP_factory{
    static Employee_Payroll getEmployee_Payroll(String emptype){
        if(emptype.equalsIgnoreCase("Admin")){  //Run time polymorphism ie at runtime we can choose which method to call
            return new adminEmpPayroll();
        }
        else if(emptype.equalsIgnoreCase("Prod")){
            return new prodEmpPayroll();

        }
        else if(emptype.equalsIgnoreCase("Sales")){
            return new salesEmpPayroll();
        }
        else{
            throw new IllegalArgumentException("Wrong type passed");
        }
    }
}

// Client class

class EP_client{
    public static void main(String[] args) {
        String emptype =  args[0];
        int empid = Integer.parseInt(args[1]);
        Employee_Payroll ep = EP_factory.getEmployee_Payroll(emptype);
        double sal = ep.CalcSalary(empid);
        System.out.println("Emp type " + emptype + " Emp id " + empid + " salary " + sal);

    }
}

// If your file starts with:
// package abstract_class;
// then you must run using the fully qualified package name:
// java -cp . abstract_class.EP_client Sales 105
// but only from the parent directory of abstract_class/.

// ie
// javac abstract_class/EP_client.java
// and then run it using:
// java -cp . abstract_class.EP_client Sales 105