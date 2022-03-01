import java.util.Scanner;
class Week4b
{
    public static void main(String o[])
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter any String = ");
        String a = s.nextLine();
        int i,l,Consonants,vowels,d,numbers;
        Consonants = vowels = d = numbers = 0;
        l = a.length();
        for (i=0;i<l;i++)
        {
            char m = a.charAt(i);
            if((m>='a' && m<='z')||(m>='A' && m<='Z'))
            {
                if(m=='a'||m=='e'||m=='i'||m=='o'||m=='u'||m=='A'||m=='E'||m=='I'||m=='O'||m=='U')
                {
                    vowels++;
                }
                else
                {
                    Consonants++;
                }
            }
            else if(m>=48 && m<=57)
            {
                numbers++;
            }
            else
            {
                d++;
            }
        }
        System.out.println("The number of Vowels = "+vowels);
        System.out.println("The number of Consonants = "+Consonants);
        System.out.println("The number of Digits = "+numbers);
        System.out.println("The number of Special Characters = "+d);
    }
}