public class IntersectionTwoArray {
    public static void main(String[] args) {
         int[] array = {1,4,68,881,54,57,2,9,2};
         int[] array2 = {1,4,68,881,54,57,2,8,2};

         
        int n = array.length;
        for(int i = 0;i<array.length;i++){
            int temp = array[i]; 
            for(int j = 0; j<array2.length-1;j++){
                if(array[i]==array2[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
