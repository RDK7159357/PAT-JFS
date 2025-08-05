package Encapsulation_Example;

class Emp{
    private int eid;
    private String ename;
    private double sal;
    private String desig;

    public Emp(){}
    public Emp(int eid , String ename, double sal){
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
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


    public String toString(){
        return eid+" "+ename + " "+ sal + " "+ desig;
    }

    public int hashCode(){
        return this.toString().hashCode();
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
