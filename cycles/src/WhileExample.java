public class WhileExample {

    public static void main(String[] args) {
        int n = 345;

        int[] array = new int[3];

        int i = 0;
        while (n > 0) {
            array[i++] = n % 10;
            n = n / 10;
        }

        for (i = 2; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
