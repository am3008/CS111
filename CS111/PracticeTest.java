public class PracticeTest {

    public static double[] f(double[][] temps)
    {
        double[] result = new double[temps.length];
        int min = 0;
        
        for(int i = 0; i < temps.length; i++) 
        { 
            for(int j = 0; j < temps[i].length; j++) 
            {
                if(temps[i][j] < temps[i][min])
                {
                    min = j;
                }
                result[i]=temps[i][min];
 
            }
            System.out.println();
        } 
        return result;
    }

    public static void main(String [] args)
    {
        double temp[][] = {{9,10,5},
                          {5,4,2}}; 
        double hi[] = f(temp);

        for(int i=0; i<hi.length;i++)
            System.out.println(hi[i]);


     


 

    }
    
}
