class DecimalToHexa{
    public static void main(String args[]){
        int decimal = 31;
        String ans = "";
        String hexDigits = "0123456789ABCDEF";
        
        while(decimal != 0){
            ans += hexDigits.charAt(decimal % 16);
            decimal /= 16;
        }
        System.out.println(new StringBuilder(ans).reverse());
    }
}