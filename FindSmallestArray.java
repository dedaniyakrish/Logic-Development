public class FindSmallestArray {
        public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4};
        int largest = findSmallest(array);
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findSmallest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
