import java.util.*;
class Player
{
    String name;
    int Rank;
    Scanner sc=new Scanner(System.in);
    public void accept()
    {
        name=sc.next();
        Rank=sc.nextInt();
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Rank:"+Rank);
    } 
}
public class Project1 
{
    public static void main(String[] args)
    {
        Player p1=new Player();
        p1.accept();
        p1.display();
    }
}
