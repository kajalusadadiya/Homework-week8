package week8;

import java.util.Scanner;

public class PatternTriangle6 {
    /* display the pattern like a triangle with a number*/

    public static void main(String[] args) {
        int x,y,n;
        System.out.print("Input number of row :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(x=1; x<=n; x++ ){
            for(y=1; y<=x; y++){
                System.out.print(y);


            }
            System.out.println("");
        }
    }

}
