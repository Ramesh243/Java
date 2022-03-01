import javax.swing.*;
class Week12b
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Table Example");
        String data[][] = {{"101","ABC","50000"},{"102","DEF","60000"},{"103","GHI","70000"},{"104","JKL","80000"},{"105","MNO","90000"}};
        String Column[] = {"ID","Name","Salary"};
        JTable jt = new JTable(data,Column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
}