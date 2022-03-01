import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Week12a extends MouseMotionAdapter implements ItemListener 
{
    JRadioButton rb1,rb2,rb3;
    int x,y,flag = 0;
    Week12a() 
    {
        JFrame f = new JFrame();
        ButtonGroup group = new ButtonGroup();
        rb1 = new JRadioButton("Line");
        rb2 = new JRadioButton("Rectangle");
        rb3 = new JRadioButton("Oval");
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
        f.add(rb1); f.add(rb2); f.add(rb3);
        JLabel jl = new JLabel();
        f.add(jl);
        f.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
                Graphics g = f.getGraphics();
                if(flag == 1)
                {
                    g.drawLine(x,y,250,250);
                }
                else if(flag == 2)
                {
                    g.drawRect(x,y,200,150);
                } 
                else if(flag == 3)
                {
                    g.drawOval(x,y,175,125);
                }
            }
        });
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setVisible(true);
        f.setSize(750,750);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == rb1) 
        {
            flag = 1;
        }
        else if(e.getSource() == rb2)
        {
            flag = 2;
        }
        else if(e.getSource() == rb3)
        {
            flag = 3;
        }
    }
    public static void main(String[] args) 
    {
        new Week12a();
    }
}