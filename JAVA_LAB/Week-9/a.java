import java.util.*;
class Week9a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        try
        {
            System.out.print("Enter any number = ");
            String r = sc.nextLine();
            int d = Integer.parseInt(r);
            int c = 10;
            int m = c/d;
            System.out.print("Enter any number = ");
            int a = sc.nextInt();
            System.out.print("Enter any number = ");
            int b = sc.nextInt();
            int q = a/b;
            System.out.println("Quotient is = "+q);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}