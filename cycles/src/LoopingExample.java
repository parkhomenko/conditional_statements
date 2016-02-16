public class LoopingExample {

    public static void main(String[] args) {

        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");*/

        int i = 1;
        while (i <= 10) {
            //System.out.println(i);
            i++; //i = i + 1;
        }

        i = 11;
        while (i <= 10) {
            System.out.println(i++);
            i++;
        }

        i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
