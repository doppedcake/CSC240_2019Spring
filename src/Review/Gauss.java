package Review;

public class Gauss
{
    public static void main(String[] args)
    {
        // For Loop
        int sum = 0;
        for(int i = 81297; i <= 100899; i += 198)
        {
            sum += i;
            //System.out.println(i);
        }

        System.out.println(sum);
    }
}
