public class PowerWithoutMulti {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int ans = 1;

        for (int i = 0; i < y; i++) {
            ans = multiply(ans, x);
        }

        System.out.println("Power is: " + ans);
    }

    static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}
