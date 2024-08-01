import java.util.*;
class Employee
{
    String Ename,Ecode;
    int MonthSal,grossSal;
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
        Ename=sc.next();
        Ecode=sc.next();
        MonthSal=sc.nextInt();
    }
    public void calcSal()
    {
        grossSal=MonthSal*12;
    }
    public void display()
    {
        System.out.println("Name:"+Ename);
        System.out.println("Code:"+Ecode);
        System.out.println("Monthly Salary:"+MonthSal);
        System.out.println("Gross Salary:"+grossSal);
    } 
}
public class Project1 
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.accept();
        e1.calcSal();
        e1.display();
    }
}
