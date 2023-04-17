
public class ConvertSeconds
{    public static void main(String[] args) 
    {
        int numSec = Integer.parseInt(args[0]);
        int secInYear = 31536000;

        int year= numSec/secInYear;
        int rem = numSec%secInYear;
        int day = rem/86400;
        rem = rem%86400;
        int hour = rem/3600;
        rem = rem%3600;
        int min = rem/60;
        rem = rem%60;
        int sec = rem;

        System.out.println(year + " years," + day + " days," + hour + " hours," + min + " minutes," + sec + " and seconds");



       


        
    }
}