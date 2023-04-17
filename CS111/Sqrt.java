public class Sqrt
{
    public static void main(String[] args)
    {

        double x = 10;

        double y = x/2;

        while(true)
        {
            y = (y+(x/y))/2;

            if(y-(x/y) < 1e-6)
            {
                break;
            }

        }
        System.out.println(y);
        
    }
}