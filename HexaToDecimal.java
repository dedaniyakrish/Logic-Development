public class HexaToDecimal {
    public static void main(String[] args) {
        String n = "1F";
        int ans = 0;
        
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int digitValue;
            if (ch >= '0' && ch <= '9') {
                digitValue = ch - '0';
            } else {
                digitValue = ch - 'A' + 10;
            }
            ans = ans * 16 + digitValue;
        }
        System.out.println(ans);
    }
}

 
