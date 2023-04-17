import java.util.*;
public class Anagram 
{
    public static void main(String[] args)
    {
        String input1 = args[0].toLowerCase();
        String input2 = args[1].toLowerCase();

        // first string (input1) count
        int[] hist = new int[26];
        for(int i = 0; i < input1.length(); i++)
        {
            char letter = input1.charAt(i);
            if(letter>='a'&& letter<='z')
            {
                hist[letter-'a']++;
            }

        }
        // second string (input2) count
        int[] hist2 = new int[26];
        for(int i = 0; i < input2.length(); i++)
        {
            char letter = input2.charAt(i);
            if(letter>='a'&& letter<='z')
            {
                hist2[letter-'a']++;
            }
        }
        System.out.println(Arrays.equals(hist,hist2));
    }
}
