public class Exam1
{
    public static void main(String[] args)
    {
        int command = Integer.parseInt(args[0]);
        for(int i = 0; i < command; i++)
        {
            if(i%2==0)
            {
                for(int j = 0; j < command; j++)
                {
                    if(j%2==0)
                    {
                        System.out.print("x");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            else
            {
                for(int j = 0; j < command; j++)
                {
                    if(j%2==0)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("x");
                    }
                }
            }
            System.out.println();
        }
    }
}