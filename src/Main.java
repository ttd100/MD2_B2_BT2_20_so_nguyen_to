
public class Main {
    public static void main(String[] args) {
        int n = 100;
        System.out.printf("tất cả số nguyên tố nhỏ hơn %d là: \n",n);
        if (n >= 2){
            System.out.print(2);
        }
        for (int i = 3; i <n ; i+=2) {
            if (isPrimeNumber(i)){
                System.out.print(" "+i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}