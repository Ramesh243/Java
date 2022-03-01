import java.net.*;  
import java.io.*;  
class Server
{  
    public static void main(String args[])throws Exception
    {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        double r = Double.parseDouble(din.readUTF());
        double a = (3.14)*r*r;
        dout.writeUTF(""+a);
        dout.flush();
        din.close();
        s.close();
        ss.close();
    }
}