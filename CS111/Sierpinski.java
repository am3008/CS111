import java.awt.*;
import javax.swing.*;

public class Sierpinski extends Canvas{

    public int n;
    public int size;
    public int[] corx = {0,350,700};
    public int[] cory = {606,0,606};  
    int x = 0;
    int y = 606;
    int side = 606;


    public void paint(Graphics g)
    {
        drawThing(g, x, y, side);
    }

    public void drawThing(Graphics g, int x, int y, int length)
    {   
        int x2 = x + length/2;
        int y2 = y - length;
        int x3 = x + length;
        int y3 = y;

        g.drawPolygon(new int[]{x,x2,x3}, new int[]{y,y2,y3},3);

        length = length/2;

            if(length>0)
            {
                drawThing(g,x,y,length);
                drawThing(g,x+length,y,length);
                drawThing(g,x+(length/2),y-length,length);
            }
        }
        

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sierpinski drawing = new Sierpinski();
        drawing.n = Integer.parseInt(args[0]);
        drawing.size = 700;
        drawing.setSize(drawing.size,drawing.size);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
       
        
    }
    
}
