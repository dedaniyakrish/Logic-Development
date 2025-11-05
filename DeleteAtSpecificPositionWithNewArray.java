class DeleteAtSpecificPositionWithNewArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positionToDelete = 2; 

        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != positionToDelete) {
                newArray[j++] = array[i];
            }
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
