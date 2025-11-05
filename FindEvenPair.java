public class FindEvenPair {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Pairs with even sum:");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) % 2 == 0) {
                    System.out.println("(" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }
}
