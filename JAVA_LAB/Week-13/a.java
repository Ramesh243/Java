import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Week13 implements ActionListener
{
    JFrame f = new JFrame("Sample Resgistration Page");
    JTextField name,uname;
    JPasswordField pwd;
    JCheckBox cb;
    Week13()
    {
        JLabel nam = new JLabel("   Name ");
        name = new JTextField(12);
        JLabel unam = new JLabel("  Username");
        uname = new JTextField(12);
        JLabel pass = new JLabel("  Password ");
        pwd = new JPasswordField(12);
        ButtonGroup b = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        b.add(male); b.add(female);
        cb = new JCheckBox("Hereby, I Agree to the Terms & Conditions");
        JLabel d = new JLabel();
        JButton res = new JButton("Register");
        f.add(nam); f.add(name);
        f.add(unam);f.add(uname);
        f.add(pass);f.add(pwd);
        f.add(male);f.add(female);
        f.add(cb);
        f.add(d);
        f.add(res);
        res.addActionListener(this);
        f.setLayout(new GridLayout(7,2));
        System.out.println(uname.getText());
        f.setSize(600,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        boolean b = true;
        if(uname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(f,"Username Field is EMPTY");
            b = false;
        }
        if(name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(f,"Name Field is EMPTY");
            b = false;
        }
        if(pwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(f,"Password Field is EMPTY");
            b = false;
        }
        if(b == true)
        {
            JOptionPane.showMessageDialog(f, "Resgistrastion Succesful with Username "+uname.getText());
        }
    }
    public static void main(String[] args)
    {
        new Week13();
    }
}