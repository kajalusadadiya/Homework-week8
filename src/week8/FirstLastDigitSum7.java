package week8;

public class FirstLastDigitSum7 {
    //Add first n last digit n given integer
    public static int sumFirstAndLastDigit(int number) {
        int firstdigit = 0;
        int lastdigit = 0;
        if (number >= 0 && number <= 9) {
            return number + number;
        } else if (number > 9) {
            lastdigit = number % 10;
            while (number > 0) {
                number /= 10;
                if (number <= 9 & number >= 0) {
                    firstdigit = number;
                }
            }
            return firstdigit + lastdigit;
        } else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

}