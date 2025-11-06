public class Automorphic {
    public static void main(String[] args) {
        int n = 76;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int square = n * n;
        int rem = (int) (square % Math.pow(10, count));
        System.out.println(n == rem ? "Automorphic" : "Not Automorphic");
    }
}
