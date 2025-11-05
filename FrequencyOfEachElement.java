public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        int n = array.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Element " + array[i] + " occurs " + count + " times.");
        }
    }
}
