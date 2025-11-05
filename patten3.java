public class patten3 {
    public static void main(String[] args) {
        for(int i = 1; i<=3;i++){
            for(int k= i;k<3;k++){
                System.out.print(" ");
                
            }
            for(int j=1;j<i*2;j++)
                System.out.print("*");
            System.out.print("\n");

        }
    }
}
