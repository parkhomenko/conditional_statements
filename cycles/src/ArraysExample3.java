public class ArraysExample3 {

    public static void main(String[] args) {

        int[] array = {3, 5, 9, 1, 8};

        int min = array[0];
        for (int element : array) {
            min = Math.min(element, min);
        }
        System.out.println(min);
    }
}
