import java.util.Scanner;
public class CaeserCipher
{
    public static void main(String[] args)
    {
        char[] letters = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner scan= new Scanner(System.in);
        System.out.println("What's the message");
        String toShift = scan.nextLine();
        System.out.println("What's the shift?");
        int key = scan.nextInt();
        scan.close();

        toShift = toShift.toLowerCase();
        String cipher = "";
        for(int i = 0; i < toShift.length(); i++)
        {
            if(toShift.charAt(i) == ' ')
            {
                cipher += " ";
                i++;
            }
            if(toShift.charAt(i) == '!')
            {
                cipher += "!";
            }
            for(int j = 0; j < letters.length; j++)
            {
                if(toShift.charAt(i) == letters[j])
                {
                    if((j+key) <= 25 && (j+key) >= 0)
                    {
                        char newChar = letters[j+key];
                        cipher += newChar;
                    }
                    else if( (j+key) > 25)
                    {
                        int help = (j+key-26);
                        int p = 0;
                        char newChar = letters[p+help];
                        cipher += newChar;
                    }
                    else if((j+key<0))
                    {
                        int help = (j+key+26);
                        int p = 0;
                        char newChar = letters[p+help];
                        cipher += newChar;
                    }


                }
            }

        }
        String realCipher = cipher.substring(0,1).toUpperCase() + cipher.substring(1);
        System.out.println(realCipher);




    }
}