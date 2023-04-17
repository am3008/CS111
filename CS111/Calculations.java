public class Calculations
{    
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        int diff= x-y;
        int prod = x*y;
        float quot = (float)x/y;
        int remain = x%y;
        float average = (x+y)/2;



        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Remainder: " + remain);
        System.out.println("Average: " + average);
    }        

}
   
