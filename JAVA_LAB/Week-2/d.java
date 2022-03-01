import java.util.Scanner;
class Week2d
{
    public static void main(String o[])
    {
        int i,j,m = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns = ");
        int c = s.nextInt();
        int a[][] = new int [r][c];
        System.out.println("Enter elements row-wise in an Order such that Year comes 1st then ID then number of items");
        System.out.println("Enter the elements of the Array: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = s.nextInt();
            }
            System.out.println("\n");
        }
        int max = a[0][0];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i][j]>max)
                {
                    max = a[i][j];
                    m = i;
                }
            }
        }
        System.out.println("Year is "+a[m][0]);
        System.out.println("ID is "+a[m][1]);
    }
}