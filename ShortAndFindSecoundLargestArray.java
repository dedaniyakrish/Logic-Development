public class ShortAndFindSecoundLargestArray {
    //bubble short
    public static void main(String[] args) {
        
        int[] array = {1,4,68,881,54,57,2,9,2};
        int n = array.length;
        for(int i = 0;i<array.length;i++){
            for(int j = i+1; j<array.length-1;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                
                }
            }
        }
        //second largest
        System.out.println(array[n-3]);
        // second smallest
        System.out.println(array[1]);
    }

    
}
