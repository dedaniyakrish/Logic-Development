public class MergeTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 2, 5, 3};
        int[] array2 = {6,7,8,9,10,15,54};
        int[] newArray = new int[array1.length + array2.length];
        int k = 0;
        int n = 0;
        for(int i = 0;i<array1.length;i++){
            newArray[k] = array1[i];
            k++;
        } 
        for(int j = 0;j<array2.length;j++){
            newArray[k] = array2[j];
            k++;
        }
        for(int x= 0;x<=newArray.length;x++){
            System.out.println(newArray[x]);
        } 
    }
}
