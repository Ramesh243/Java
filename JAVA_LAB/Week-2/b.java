import java.util.Scanner;
class Week2b
{
    public static void main(String args[]) 
    {
        Scanner x = new Scanner (System.in);
        int c,d,i,j;
        System.out.print("Enter the number of elements = ");
        int n = x.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements of the Array = ");
        for(i=0;i<n;i++)
        {
            a[i] = x.nextInt();
        }
        c = 0;
        d = 0;
        System.out.print("The elements that are both ODD & PRIME are ");
        for(i=0;i<n;i++)
        {
            if((a[i]%2)!=0 && a[i]!=1)
            {
                for (j=2;j<(a[i]/2);j++)
                {
                    if((a[i]%j)==0)
                    {
                        c++;
                    }
                }
                if(c==0)
                {
                    System.out.print(a[i]+" ");
                    d++;
                }
            }
        }
        if(d==0)
        {
            System.out.println("NOT FOUND");
        }
    }
}