import java.util.*;
class Myclass
{
    float area;
    public void calcArea(float a)
    {
        area=a*a;
        System.out.println(area);
    }
    public void calcArea(float a,float b)
    {
        area=a*b;
        System.out.println(area);
    }
}
public class Project1 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        Myclass obj=new Myclass();
        obj.calcArea(a);
    }
}
