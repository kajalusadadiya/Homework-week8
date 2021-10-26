package week8;

public class FibonacciNum9 {
    // Print the sequence 1 1 2 3 5 8 13 21 (fibonacci number)

    public static void main(String[] args) {
        int maxnum =10;
        int prenum = 0;
        int nextnum = 1;
        System.out.println("Fibonacci series of" + maxnum+"numbers");
        for(int i=1; i<=maxnum; i++){
            System.out.print(prenum +" ");
            int sum = prenum + nextnum;
            prenum = nextnum;
            nextnum = sum;
        }
    }
}
