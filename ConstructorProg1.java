public class ConstructorProg1 {
    int employeeId=0;
    int salary=0;
    String dept="";
    ConstructorProg1(int id, int sal, String str){
     employeeId=id;
     salary=sal;
     dept=str;
    }

public static void main(String args[]){
    ConstructorProg1 Aditya=new ConstructorProg1(101,3000,"Testing");
    ConstructorProg1 Rahul =new ConstructorProg1(102,5000,"Er..");
    System.out.println(Aditya.employeeId + " " +Aditya.salary + " " + Aditya.dept);
    System.out.println(Rahul.employeeId + " " + Rahul.salary + " " +Rahul.dept);
    

}
}