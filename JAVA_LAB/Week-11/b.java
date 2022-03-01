import javax.swing.*;
import java.awt.*;
class Week11b
{
    public static void main(String args[])
    {
        JFrame j = new JFrame("Sample resgistration page");
        JLabel nam = new JLabel("   Name");
        JTextField name = new JTextField(12);
        JLabel unam = new JLabel("  User Name");
        JTextField uname = new JTextField(12);
        JLabel pass = new JLabel("  Password");
        JPasswordField pwd = new JPasswordField(12);
        ButtonGroup b = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        b.add(male);
        b.add(female);
        JCheckBox cb = new JCheckBox("Hereby, I Agree to the Terms & Conditions");
        JLabel d = new JLabel();
        JButton res = new JButton("Register");
        j.add(nam); j.add(name);
        j.add(unam);j.add(uname);
        j.add(pass);j.add(pwd);
        j.add(male);j.add(female);
        j.add(cb);
        j.add(d);
        j.add(res);
        j.setLayout(new GridLayout(8,2));
        j.setSize(500,250);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}