import java.util.Scanner;
import java.lang.Math;
public class GuessRandom
{    
    public static void main(String[] args) 
    {
      
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <10; i++)
        {
            int randNum = (int) (Math.random()*9)+1;
            System.out.println(randNum);
        }
           
       
    
        System.out.println("I'm thinking of a number from 1 to 10. Your Guess?");
        //int guess = scan.nextInt();
        
       // int diff = Math.abs(randNum - guess);
        //System.out.println("It was " + randNum + ". You were off by " + diff);
        scan.close();
        scan.close();
        int[] a = new int[4];
        int[] b = new int[4];

        b=a;
        a[3] = 100;

        if(a==b) System.out.print("equal");
        else    System.out.println("not equal");

        
    }
}