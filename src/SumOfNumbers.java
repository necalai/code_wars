public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(GetSum(0, 1));
    }

    public static int GetSum(int a, int b) {
        int sum = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (; a <= b; ++a) {
            sum += a;
        }

        return a == b ? a : sum;
    }
}
