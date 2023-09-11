public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            count = count + checkMultiple(i);
        }
        System.out.println(count);
    }

    private static int checkMultiple(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 || divisibleBy5) {
            return 1;
        } else {
            return 0;
        }
    }
}
