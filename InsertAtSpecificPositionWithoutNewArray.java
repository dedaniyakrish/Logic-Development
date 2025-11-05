public class InsertAtSpecificPositionWithoutNewArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 9;
        int position = 2; 
        
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        
        array[position-1] = elementToInsert;
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
