public class Patten15 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            System.out.print("1 ");
            for (int j = 1; j < i - 1; j++) {
                System.out.print("* ");
            }
            if (i > 1) {
                System.out.print(i + " ");
            }
            for (int j = 1; j < i - 1; j++) {
                System.out.print("* ");
            }
            if (i > 1) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
