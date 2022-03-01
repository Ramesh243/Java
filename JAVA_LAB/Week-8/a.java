import java.io.*;
import java.util.*;
class Week8a
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Read File Location: ");
        String inp = sc.nextLine();
        File f = new File(inp);
        FileInputStream fin = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(fin);
        BufferedReader br = new BufferedReader(isr);
        int count;
        int alpha = 0;
        int num = 0;
        int spcl_symbols = 0;
        while((count=fin.read())!=-1)
        {
            char ch = (char)count;
            if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
            {
                alpha++;
            }
            else if(ch>='0' && ch<='9')
            {
                num++;
            }
            else if(ch!=' ' && ch!='\n' && ch!='\t' && ch!=13)
            {
                spcl_symbols++;
            }
        }
        FileOutputStream fout = new FileOutputStream("dest.txt");
        String line = "Total Alphabet Count = "+alpha;
        byte b[] = line.getBytes();
        fout.write(b);
        line = "\nTotal Numerical Count = "+num;
        b = line.getBytes();
        fout.write(b);
        line = "\nTotal Special Character Count = "+spcl_symbols;
        b = line.getBytes();
        fout.write(b);
        System.out.println("Output Generated in File named: dest.txt");
        fout.close();
        fin.close();
    }
}