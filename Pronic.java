public class Pronic {
    public static void main(String[] args) {
        int n = 18;
        boolean isPronic = false;
        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }
        System.out.println(isPronic ? "Pronic" : "Not Pronic");
    }
}
