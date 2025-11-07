//1
//2 5
//3 6 8
//4 7 9 10
public class Patten11A {
    public static void main(String[] args) {
        int n = 5;
        int gap = 0;
        int num = 0;
        for (int i = 1; i <= 4; i++) {
            gap = n-1;
            num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                gap--;
                num = num + gap;
            }
            System.out.println();
        }
    }
}
