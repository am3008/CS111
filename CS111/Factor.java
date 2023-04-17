public class Factor {
    public static void main(String[] args) 
    {
        int x = 64;

        for(int i = 2; i< x; i++) 
        {
            while(x%i == 0) 
            {
                System.out.print(i+" ");
                x = x/i;
            }
        }
        if(x >2) 
        {
            System.out.println(x);
        }
    }
}
       

