import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Sierpinkskii extends Canvas
{
    public int n;
    public int size;
    ArrayList<Integer> bruh = new ArrayList<Integer>();
    int p1x = 0;
    int p2x = 350;
    int p3x = 700;
    int p1y = 606;
    int p2y = 0;
    int p3y = 606;

    public static int midpoint(int x, int y)
    {
        return (x+y)/2;
    }

    public void paint(Graphics g)
    {

        int[] coor1 = {p1x,p2x,p3x};
        int[] coor2 = {p1y,p2y,p3y};

        int ax = midpoint(coor1[0],coor1[1]);
        int bx = midpoint(coor1[0],coor1[2]);
        int cx = midpoint(coor1[1],coor1[2]);
        int[] coorx = {ax,bx,cx};

        int ay = midpoint(coor2[0],coor2[1]);
        int by = midpoint(coor2[0],coor2[2]);
        int cy = midpoint(coor2[1],coor2[2]);
        int[] coory = {ay,by,cy};

        g.drawPolygon(coor1,coor2,3);
        g.drawPolygon(coorx,coory,3);

        p2x = ax;
        p2y = ay;
        p3x = bx;
        p3y = by;

        paint(g);


    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sierpinkskii drawing = new Sierpinkskii();
        drawing.n = 0;
        drawing.size = 700;
        drawing.setSize(drawing.size, drawing.size);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }
} 

