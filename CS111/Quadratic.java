import java.lang.Math;
public class Quadratic{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double root1;
        double root2;

        int determinant = b*b - 4*a*c;
        
        if(determinant >= 0)
        {
            root1 = (-b + Math.sqrt(determinant)) / (2*a);
            root2 = (-b - Math.sqrt(determinant)) / (2*a);
            if(root1 == Math.rint(root1))
            {
                System.out.print((int) root1 + ", ");
            }
            if(root2 == Math.rint(root2))
            {
                System.out.print((int) root2);
            }
            if(root1 != Math.rint(root1))
            {
                System.out.print(root1 + ", ");
            }
            if(root2 != Math.rint(root2))
            {
                System.out.print(root2);
            }
        }
        else
        {
            double num = -b/(2*a);
            double imaginary = Math.sqrt(-determinant)/(2*a);

            if(num == 0)
            {
                if(imaginary == Math.rint(imaginary))
                {
                    System.out.print( (int) imaginary + "i, ");
                    System.out.println("-" + (int) imaginary + "i");
                }
                else
                {
                    System.out.print(imaginary + "i, ");
                    System.out.println("-" + imaginary + "i");

                }

            }
            else
            {
                if(num == Math.rint(num) && imaginary == Math.rint(imaginary))
                {
                    System.out.print((int)num +  "+" + (int) imaginary + "i, ");
                    System.out.println((int)num +  "-" + (int) imaginary + "i");   
                }
                else if(num == Math.rint(num) && imaginary != Math.rint(imaginary))
                {
                    System.out.print( (int) num +  "+" + imaginary + "i, ");
                    System.out.println( (int) num +  "-" + imaginary + "i");
                }
                else if(num != Math.rint(num) && imaginary == Math.rint(imaginary))
                {
                    System.out.print(num +  "+" + (int) imaginary + "i, ");
                    System.out.println(num +  "-" + (int) imaginary + "i");

                }
                else
                {
                    System.out.print(num +  "+" + imaginary + "i, ");
                    System.out.println(num +  "-" + imaginary + "i");

                }
            }
        }            
    }
}
