import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.lang.Math;
import java.util.*;

public class NBody extends Canvas implements ActionListener
{
    public int n;
    public int xCor;
    public int yCor;
    public int size;
    public double dt;
    public double maxVel;
    public double maxMass;
    public Star[] stars;

    public void init(int n)
    {
        // Your initialization code here
        stars = new Star[n];
        this.n = n;
        for(int i = 0; i < stars.length; i++)
        {
            stars[i] = new Star();
            stars[i].x = (int) (Math.random()*800);
            stars[i].y = (int) (Math.random()*800);

            Random ram = new Random();
            stars[i].vel = ram.nextInt(10+10)-10;
            stars[i].size = (int) (Math.random()*maxMass) +1;

            stars[i].r = (int) (Math.random()*127)+128;
            stars[i].g = (int) (Math.random()*127)+128;
            stars[i].b = (int) (Math.random()*127)+128;
        }
    }

    // Draw a circle centered at (x, y) with radius r
    public void drawCircle(Graphics g, int x, int y, int r)
    {
        int d = 2*r;
        g.fillOval(x - r, y - r, d, d);
    }

    public void paint(Graphics g)
    {
        // Clear the screen
        super.paint(g);

        // Your drawing code here:
        for(int i = 0; i < stars.length; i++)
        {
            g.setColor(new Color(stars[i].r,stars[i].g, stars[i].b));
            drawCircle(g, stars[i].x, stars[i].y, stars[i].size);

        }
    }

    public void actionPerformed(ActionEvent e)
    {
        // Your update code here:
        for(int i = 0; i < stars.length; i++)
        {
            for(int j = 1; j < stars.length; j++)
            {
                double g = 8;
                double x = stars[i].x - stars[j].x;
                double y = stars[i].y - stars[j].y;
                double r =  Math.sqrt((x*x) + (y*y));
                r = r/stars[i].x;
                double f = (g*stars[i].size*stars[j].size)/(r*r);
                double a = f/(stars[i].size+stars[j].size);
                stars[i].vel = stars[i].vel + a*dt;
                stars[i].x +=  (int) (stars[i].vel);
                stars[i].y +=  (int) (stars[i].vel);
            }
        }
        // Repaint the screen
        repaint();
        Toolkit.getDefaultToolkit().sync();
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int n = 100;

        NBody nbody = new NBody();
        nbody.setBackground(Color.BLACK);
        nbody.size = 800;
        nbody.maxVel = 10;
        nbody.maxMass = 10;
        nbody.dt = 0.1;
        nbody.setPreferredSize(new Dimension(nbody.size, nbody.size));
        nbody.init(n);

        frame.add(nbody);
        frame.pack();

        Timer timer = new Timer(16, nbody);
        timer.start();

        frame.setVisible(true);
    }
}