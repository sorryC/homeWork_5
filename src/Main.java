public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(++i + " ");
        }
        System.out.println();

        for (; i > 0; --i) {
            System.out.println(i + " ");
        }
    }
}