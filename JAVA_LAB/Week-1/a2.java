import java.util.Scanner;
class Week1a2
{
    public static void main(String args[])
    {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the radius of the circle = ");
        int r = b.nextInt();
        double perimeter = 2 * 3.14 * r; 
        double area = 3.14 * r * r;
        System.out.println("The Perimeter of the circle = "+perimeter);
        System.out.println("The Area of the circle = "+area);
    }
}