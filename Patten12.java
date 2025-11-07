//1
//1*1
//1*3*1
//1*3*5*3*1
public class Patten12 {
    public static void main(String[] args) {
        int n = 4;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (2*i - 1); j += 2) {
                System.out.print(j);
                if(j < (2*i - 1)) System.out.print("*");
            }
            for(int j = (2*i - 3); j >= 1; j -= 2) {
                System.out.print("*" + j);
            }
            System.out.println();
        }
    }
}
