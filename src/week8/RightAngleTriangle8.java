package week8;

import java.util.Scanner;

public class RightAngleTriangle8 {
    /*right angle tringle of@ using nested for loops*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many row:");
        int row = input.nextInt();
        for(int x = 1; x<=row; x++){
            for(int i=1; i<=x; i++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
