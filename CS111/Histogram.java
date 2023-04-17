import java.util.*;
public class Histogram
{
    public static void main(String[] args)
    {
        String input = args[0].toLowerCase();
        int[] hist = new int[26];
        for(int i = 0; i < input.length(); i++)
        {
            char letter = input.charAt(i);
            if(letter>='a'&& letter<='z')
            {
                hist[letter-'a']++;
            }
        }
        System.out.println(Arrays.toString(hist));
        
    }
}