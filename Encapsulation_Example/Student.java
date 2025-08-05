package Encapsulation_Example;

public class Student {
    private String s_name;
    private String rollno;

    public Student(){};

    public Student(String s_name,String rollno){
        this.s_name = s_name;
        this.rollno = rollno;
    }
    public void setSname(String name){
        s_name = name;
    }
    public String getSname(){
        return s_name;
    }
    public void setrollno(String rollno){
        this.rollno = rollno;
    }
    public String getrollno(){
        return rollno;
    }

    public String toString(){
        return "Student name " +s_name + " Student rollno "+ rollno;
    }
    public int hashCode(){
        return this.toString().hashCode();
    }

    public boolean equals(Object obj){
        boolean flag = false;

        if(obj instanceof Student){
            Student s = (Student)obj;

            if(this.s_name == s.getSname() && this.rollno.equals(s.getrollno())){
                flag = true;
            }
        }
        return flag;

    }
}
