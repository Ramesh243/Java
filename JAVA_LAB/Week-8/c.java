import java.io.*;
import java.util.*;
class Week8c 
{
    public static void main(String[] args) throws IOException
    {
        List<String> techwords= new ArrayList<String>();
        List<String> stopwords= new ArrayList<String>();
        BufferedReader bf1 = new BufferedReader(new FileReader("b.txt"));
        BufferedReader bf2 = new BufferedReader(new FileReader("a.txt"));
        String line = bf1.readLine();
        while (line!= null)
        {
            String words[] = line.split("\\s");
            List<String> wordlist = Arrays.asList(words);
            techwords.addAll(wordlist);
            line = bf1.readLine();
        }
        line = bf2.readLine();
        while (line != null)
        {
            String words[] = line.split("\\s");
            List<String> wordlist = Arrays.asList(words);
            stopwords.addAll(wordlist);
            line = bf2.readLine();
        }
        for(int i=0;i<stopwords.size();i++)
        {
            for(int j=0;j<techwords.size();j++)
            {
                if((stopwords.get(i)).equals(techwords.get(j)))
                {
                    techwords.remove(j);
                    j--;
                }
            }
        }
        Collections.sort(techwords);
        System.out.println(techwords);
    }
}