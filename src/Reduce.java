public class Reduce {
    private static int[] array;
    public static void main(String[] args) {
        System.out.println(recurse(100, 0));
    }

    private static int recurse(int i, int index) {
        if (i == 0) {
            return index;
        } else if (i % 2 == 0) {
            return recurse(i/2, index + 1);
        } else {
            return recurse(i - 1, index + 1);
        }
    }
}
