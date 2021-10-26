package week8;

public class LeftAngle15 {


    public static void main(String[] args)// main method
    {
        final int SIZE = 5;// variable initialised

        for (int i = 1; i <= SIZE; i++)// logic for left angle
        {
            for (int j = 1; j <= i; j++)// nested loop
            {
                System.out.print( "*");//print statement
            }

            System.out.println();
        }
    }
}