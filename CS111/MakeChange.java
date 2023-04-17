public class MakeChange
{
    public static void main(String[] args)
    {
        int rem = Integer.parseInt(args[0]);
        int combinations = 0;

        for(int quart = 0; quart <= rem; quart++)
        {
            for(int dime = 0; dime <= rem; dime++)
            {
                for(int nick = 0; nick <= rem; nick++)
                {
                    for(int penny = 0; penny <= rem; penny++)
                    {
                        if(quart*25 + dime*10 + nick*5 + penny*1 == rem)
                        {
                            combinations++;
                        }
                    }
                }
            }
        }

        System.out.println(combinations + " ways:");
        
        for(int quart = 0; quart <= rem; quart++)
        {
            for(int dime = 0; dime <= rem; dime++)
            {
                for(int nick = 0; nick <= rem; nick++)
                {
                    for(int penny = 0; penny <= rem; penny++)
                    {
                        if(quart*25 + dime*10 + nick*5 + penny*1 == rem)
                        {
                            System.out.println(quart + " quarters, " + dime + " dimes, " + nick + " nickels, " + penny + " pennies");
                        }
                        
                    }
                }
            }
        }
        
    }
    
}
