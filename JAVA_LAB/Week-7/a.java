import java.util.*;
class Week7a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the lower limit = ");
        int x = sc.nextInt();
        System.out.print("Enter the upper limit = ");
        int y = sc.nextInt();
        System.out.print("Enter the number of random numbers to be generated = ");
        int n = sc.nextInt();
        System.out.print("The random numbers between "+x+" and "+y+" is = ");
        for(int i=0;i<n;i++)
        {
            int random = (int)(Math.random()*(y-x+1)+1);
            System.out.print(random+" ");
        }
    }
}