public class OneToNAllPrime {
    public static void main(String[] args) {
        int n = 20; 
        System.out.println("Prime numbers from 1 to " + n + " are:");
        
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
