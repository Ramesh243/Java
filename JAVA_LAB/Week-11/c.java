import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Week11c extends MouseMotionAdapter 
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Mouse Adapter");
        f.addMouseMotionListener(new MouseAdapter() 
        {
            public void mouseDragged(MouseEvent e) 
            {
                Graphics g = f.getGraphics();
                g.setColor(Color.black);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }
        });
        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}