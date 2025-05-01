package Encapsulation_Example;

import java.util.List;

public class Dept {

    // private variables
    private int deptno; 
    private String deptname;
    private String loc;
    private List<Emp> empList;

    // public no parameter constructor
    public Dept() {}

    //public parameter constructor
    public Dept(int no, String dname, String loc, List<Emp> emps){
        deptno = no;
        deptname = dname;
        this.loc = loc;
        empList = emps; 
    }

    // public setter and getter method for each private variable
    public void setDeptno(int deptno){
        this.deptno = deptno;
    }
    public int getDeptno(){
        return deptno;
    }

    public void setDeptname(String deptname){
        this.deptname = deptname;
    }
    public String getDeptname(){
        return deptname;
    }

    public void setLoc(String loc){
        this.loc = loc;
    }
    public String getLoc(){
        return loc;
    }

    
    public void setEmpList(List<Emp> empList){
        this.empList = empList;
    }

    public List<Emp> getEmpList(){
        return empList;
    }


    // override 3 methods
    public String toString(){
        return deptno+ " "+deptname+" "+loc;
    }

    public int hashCode(){
        return toString().hashCode();
    }

    public boolean equals(Object obj){
        boolean flag = false;

        if(obj instanceof Dept){
            Dept d = (Dept)obj;

            if(this.deptno == d.getDeptno() && this.deptname.equals(d.getDeptname()) && this.loc.equals(d.getLoc())){
                flag = true;
            }
        }

        return flag;
    }

}

 class Emp{
    private int eid;
    private String ename;
    private double sal;
    private String desig;
    private Dept dept;

    public Emp(){}
    public Emp(int eid , String ename, double sal, Dept dept){
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
        this.dept = dept;
    }

    public void setEid(int eid){
        this.eid = eid;
    }
    public int getEid(){
        return eid;
    }

    public void setEname(String ename){
        this.ename = ename;
    }
    public String getEname(){
        return ename;
    }

    public void setSal(double sal){
        this.sal = sal;

    }
    public double getSal(){
        return sal;
    }

    public void setDesig(String desig){
        this.desig = desig;
    }
    public String getDesig(){
        return getDesig();
    }

    public void setDept(Dept dept){
        this.dept = dept;
    }
    public Dept getDept(){
        return dept;
    }

    public String toString(){
        return eid+" "+ename + " "+ sal + " "+ desig;
    }

    public int hashCode(){
        return toString().hashCode();
    }

    public boolean equals(Object obj){
        boolean flag = false;
        if (obj instanceof Emp){ // if this condition is not there it will raise an exception
            Emp e = (Emp)obj;

            if(this.eid == e.getEid() && this.ename.equals(e.getEname()) &&this.sal == e.getSal() && this.desig.equals(e.getDesig())){
                flag = true;
            }
        }
        return flag;
    }


}

// Emp class

// private int eid;
// private String ename;
// private double sal;
// private String desig;
// private private Dept dept;
