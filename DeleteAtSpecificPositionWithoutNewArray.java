public class DeleteAtSpecificPositionWithoutNewArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positionToDelete = 2; 
        
        for (int i = positionToDelete; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
