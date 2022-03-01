import java.util.Scanner;
class Week2c
{
    int a[],b[];
    public static void main(String args[]) 
    {
        Scanner x = new Scanner (System.in);
        int c=0,d,i,j;
        System.out.print("Enter the number of elements = ");
        int n = x.nextInt();
        int a[] = new int [n];
        int b[] = new int [n];
        System.out.print("Enter the elements of the Array = ");
        for(i=0;i<n;i++)
        {
            a[i] = x.nextInt();
        }
        d = -1;
        for(i=0;i<n;i++)
        {
            c = 1;
            for(j=i+1;j<n;j++)
            {
                c++;
                b[j] = d;
            }
            if (b[i]!=d)
            {
                b[i] = c;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("    ELEMENT    |    FREQUENCY   ");
        System.out.println("--------------------------------");
        for(i=0;i<c;i++)
        {
            if (b[i]!=d)
            {
                System.out.println("       "+a[i]+"       |       "+b[i]+"        ");
            }
        }
        System.out.println("--------------------------------");
    }
}