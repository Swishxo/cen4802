
public class Fib {
    public static void main(String[] args) {
        int num = 10;
        int fib = 0;
        System.out.print("Number # " + num +"\nSeq: ");
        for (int i = 0; i <= num; i++) {
            fib = fibonacci(i);
            System.out.print(fib + " ");
        }
    }

    /**
     * This function is recursive and take a param.
     * @param n is the int passed
     * subtracts n by 1 and 2.
     * if(base is True) return n
     *
     * @return fibonacci(n - 1) + fibonacci(n - 2)
     * input# 10: fibonacci(10 - 1) + fibonacci(10 - 2)= fib(9) + fib(8)............
     */
    public static int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
