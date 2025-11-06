public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 25;
        
        int count = 0;
        int oct =0,place= 1;
        while (n != 0) {
            int rem = n%8;

            count++;
            oct = oct + (rem*place);
            place= place*(int)(Math.pow(10, count));
            n = n / 8;
        }
        System.out.println(oct);
    }
}
