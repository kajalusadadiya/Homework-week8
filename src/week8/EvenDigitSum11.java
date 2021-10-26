package week8;

import java.util.Scanner;

public class EvenDigitSum11 {
      /*
    Even Digit Sum
     */

    public static void main(String[] args) {
        System.out.println( getEvenDigitSum(-22));
        Scanner scan = new Scanner(System.in);
       // finalnumber = scan.nextInt();
        scan.close();
    }

    public static int  getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int finalNumber =0;
        while(number>0){
            if((number%10)%2==0){
                finalNumber+=number%10;
            }
            number=number/10;

        }
        return finalNumber;

    }
}
