package week8;

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {


        public static void main (String[] args ){
            Scanner in = new Scanner(System.in);
            int minNumber = 0;
            int maxNumber = 0;
            boolean hasMax = false;
            boolean hasMin = false;

            while (true) {

                System.out.println("Enter number :");
                if (in.hasNextInt()) {
                    int input = in.nextInt();
                    if (input < minNumber || !hasMin) {
                        minNumber = input;
                        hasMin = true;

                    }
                    if (input > maxNumber || !hasMax) {
                        maxNumber = input;
                        hasMax = true;
                    }
                } else {
                    System.out.println("minNumber = " + minNumber);
                    System.out.println("maxNumber = " + maxNumber);
                    break;

                }
            }
            in.close();
        }
    }
