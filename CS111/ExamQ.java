import java.awt.*;
import javax.swing.*;
 
public class ExamQ extends Canvas
{
   public void paint(Graphics g)
   {
        int r = 10;
 
        for(int i = 1; i <= 10; i++)
        {
            int b = r * 2;
            g.drawOval(200-r, 200-r, b, b);
            r++;
        }

 
   }
 
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ExamQ drawing = new ExamQ();
       drawing.setSize(400, 400);
       frame.add(drawing);
       frame.pack();
       frame.setVisible(true);
   }
}
