public class SearchElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 5, 6, 4};
        int element = 4;
        int n = array.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (array[i] == element) {
                System.out.println("Your element " + element + " is found at position " + (i + 1));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element " + element + " not found in the array.");
        }
    }
}
