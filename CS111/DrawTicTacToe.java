import java.awt.*;
import javax.swing.*;
public class DrawTicTacToe extends Canvas
{
        public int xRow, xCol;
        public int oRow, oCol;

        public void paint(Graphics g)
        {
                g.drawLine(150,50,150,350);
                g.drawLine(250,50,250,350);
                g.drawLine(50,150,350,150);
                g.drawLine(50,250,350,250);

                g.drawOval(oCol*100+65,oRow*100+65,60,60);

                g.drawLine(xCol*100+70,xRow*100+50,xCol*100+125,xRow*100+135);
                g.drawLine(xCol*100+70,xRow*100+135,xCol*100+125,xRow*100+50);


                
        }
        public static void main(String[] args) 
        {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                DrawTicTacToe drawing = new DrawTicTacToe();
                drawing.xRow = Integer.parseInt(args[0]);
                drawing.xCol = Integer.parseInt(args[1]);
                drawing.oRow = Integer.parseInt(args[2]);
                drawing.oCol = Integer.parseInt(args[3]);
                drawing.setSize(400, 400);
                frame.add(drawing);
                frame.pack();
                frame.setVisible(true);
        }
}
