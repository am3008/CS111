import java.util.Scanner;
public class Pyramid
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();

        for(int i = 1; i <= height; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

        for(int i = height; i >= 1; i--)
        {
            for(int j = 1; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        scan.close();
    }
}