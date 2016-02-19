public class ArrayInputFromConsole {

    public static void main(String[] args) {

        int[] array = Utils.getArrayFromConsole();

        int sum = findTheSumOfAllElementsOfTheArray(array);

        Utils.printArray(array);

        System.out.println("Sum is " + sum);
    }

    private static int findTheSumOfAllElementsOfTheArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
