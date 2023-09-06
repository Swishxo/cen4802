
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

    public static int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
