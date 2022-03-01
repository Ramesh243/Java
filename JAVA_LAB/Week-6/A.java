package report;
import java.util.Scanner;
import p1.*;
import p2.*;
class Example implements Sports
{
    public static void show(String sport,int players)
    {
        System.out.println("The Sport is: "+sport);
        System.out.println("No. of players = "+players);
    }
}
class A
{
    public static void main(String o[])
    {
        Scanner u = new Scanner(System.in);
        Example x = new Example();
        x.show("Football",11);
        System.out.print("Enter the name: ");
        String s = u.nextLine();
        System.out.print("Enter the Branch: ");
        String v = u.nextLine();
        System.out.print("Enter the roll number = ");
        int t = u.nextInt();
        Student q = new Student();
        q.Student(s,t,v);
    }
}