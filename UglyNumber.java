public class UglyNumber {
    public static void main(String[] args) {
        int n= 6;
        int flag = 0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else {
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("the number is not ugly");
        }
        else{
            System.out.println("The number is a ugly");
        }
    }
}
