public class InsertAtSpecificPosition {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 9;
        int position = 2; 
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = elementToInsert;
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

