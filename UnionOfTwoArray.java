
import java.util.Arrays;

public class UnionOfTwoArray {
    public static void main(String[] args) {
         int[] array = {1,4,68,881,54,57,2,9};
         int[] array2 = {1,4,68,881,54,57,2,8};

         
        
        Arrays.sort(array);
        Arrays.sort(array2);
         int n= Math.max(array.length, array2.length);
        for(int i = 0 ;i<n;i++){
            if(array[i]== array2[i]){
                System.out.println(array[i]);
            }
            else{
                System.out.println(array[i]);
                System.out.println(array2[i]);
            }
        }
    }
}
 