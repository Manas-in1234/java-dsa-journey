
public class Fibonacci {
    static void fib(int n ){
        int a = 0, b = 1;
        for(int i = 0; i<n; i++){
            System.out.print(a+ " ");
            int nxt = a + b;
            a = b;
            b = nxt;
        }
    }
    public static void main(String[] args){
        fib(7);
    }
}
