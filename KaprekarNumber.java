public  class KaprekarNumber {
    public static void main(String[] args) {
        int num = 45;
        int d = Integer.toString(num).length();
        
        int square = num * num;
        String squareStr = Integer.toString(square);
        
        String rightPartStr = squareStr.length() >= d ? squareStr.substring(squareStr.length() - d) : squareStr;
        String leftPartStr = squareStr.length() > d ? squareStr.substring(0, squareStr.length() - d) : "0";
        
        int rightPart = Integer.parseInt(rightPartStr);
        int leftPart = Integer.parseInt(leftPartStr);
        
        if (leftPart + rightPart == num) {
            System.out.println(num + " is a Kaprekar Number");
        } else {
            System.out.println(num + " is not a Kaprekar Number");
        }
    }
    
}
