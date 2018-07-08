public class DontGiveMeFive {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(-5, 10));
    }

    public static int dontGiveMeFive(int start, int end) {
        int result = 0;

        for (int i = start; i <= end; ++i) {
            int num = i;

            ++result;

            while (num != 0) {
                if (Math.abs(num % 10) == 5) {
                    --result;
                    break;
                }

                num /= 10;
            }
        }

        return result;
    }
}
