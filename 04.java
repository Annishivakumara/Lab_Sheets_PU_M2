import java.util.*;
class Account
{
    String name,custId;
    private int pinNo;
    Scanner sc=new Scanner(System.in);
    public void read()
    {
        name=sc.next();
        custId=sc.next();
        pinNo=sc.nextInt();
        validate();
    }
    private void validate()
    {
        if (pinNo==1234)
            System.out.println("WELCOME");
        else
            System.out.println("Invalid pin");
    }
}
public class Project1 
{
    public static void main(String[] args)
    {
        Account a1=new Account();
        a1.read();
    }
}
