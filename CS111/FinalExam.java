public class FinalExam
{    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int e1 = Integer.parseInt(args[1]);
        int e2 = Integer.parseInt(args[2]);
        int r = Integer.parseInt(args[3]);

        int target = 90;

        double total =((0.5 * a) + (0.15 * e1) + (0.15 * e2) + (0.05 * r));

        double needG = ((target - total) / 0.15);

        System.out.println(needG);

        

        
    }
}