public class ScalingSquaredString {
    public static void main(String[] args) {
        System.out.println(scale("abcd\nefgh\nijkl\nmnop", 2, 3));
    }

    public static String scale(String strng, int k, int v) {
        StringBuilder result = new StringBuilder();
        int len = strng.indexOf("\n");

        while (strng.length() > 0) {
            for (int i = 0; i < v; ++i) {
                for (int j = 0; j < len; ++j) {
                    for (int c = 0; c < k; ++c) {
                        result.append(strng.charAt(0));
                    }
                }
            }
        }

        return result.toString();
    }
}
