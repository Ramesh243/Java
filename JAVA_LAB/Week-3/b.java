import java.util.Scanner;
public class Week3b
{
    public static void main(String o[])
    {
        Calculator x = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number a = ");
        int a = s.nextInt();
        System.out.print("Enter any number b = ");
        int b = s.nextInt();
        System.out.print("Enter any number c = ");
        double c = s.nextDouble();
        System.out.print("Enter any number d = ");
        double d = s.nextDouble();
        double p = x.PowerInt(a,b);
        double q = x.PowerDouble(c,d);
        System.out.println("The exponent of "+a+" ^ "+b+" is = "+p);
        System.out.println("The exponent of "+c+" ^ "+d+" is = "+q);
    }
}
class Calculator
{
    static double PowerInt(int i,int j)
    {
        return Math.pow(i,j);
    }
    static double PowerDouble(double num1,double num2)
    {
        return Math.pow(num1,num2);
    }
}