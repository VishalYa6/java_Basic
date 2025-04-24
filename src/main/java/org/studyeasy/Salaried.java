package org.studyeasy;


class Emp{
    int emp_id ;
    String emp_name;
    protected Emp(int id , String name){
        this.emp_id = id;
        emp_name = name ;
    }
    public void Print(){
        System.out.println("EMP ID "+ emp_id);
        System.out.println("Emp Name " + emp_name);
    }
}

class Salary extends Emp{
    int basic ;
    String position ;
    Salary(int id , String name , int basicsalary, String posi ){
        super(id , name);
        basic = basicsalary;
        position = posi;

    }
    public void calculate(){
        float total = basic + (basic * 0.3f) + (basic * 0.5f);
        System.out.println("Total Salary is " + total);
    }
    public void Print(){
        super.Print();
        System.out.println("Your position is: "+ position);
        calculate();
    }


}
class dailywage extends Emp{
    int basic ;
    int days;
    String position ;
    dailywage(int id , String name , int basicsalary, int numberdays){
        super(id , name);
        basic = basicsalary;
        days = numberdays;

    }
    public void calculate(){
        float total = basic + days;
        System.out.println("Total Salary is " + total);
    }
    public void Print(){
        super.Print();
        System.out.println("Your have worked for: "+ days );
        calculate();
    }


}

public class Salaried {
    public static void main(String[] args) {
        Salary obj1 = new Salary(2030,"Vishal", 4000, "profeessor ");
        dailywage obj2 = new dailywage(120, "Radhe", 4500, 23);
        obj1.Print();
        obj2.Print();
    }
}