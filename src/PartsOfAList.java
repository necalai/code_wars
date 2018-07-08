import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartsOfAList {
    public static void main(String[] args) {
        String[] a = {"az", "toto", "picaro", "zone", "kiwi"};

        for (String[] arr : partlist(a)) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static String[][] partlist(String[] arr) {
        List<String[]> result = new ArrayList<>();

        for (int i = 1; i < arr.length; ++i) {
        String part1 = new String();
        String part2 = new String();

            for (int j = 0; j < i; ++j) {
                part1 += arr[j] + " ";
            }

            for (int j = i; j < arr.length; ++j) {
                part2 += arr[j] + " ";
            }

            result.add(new String[] {part1.trim(), part2.trim()});
        }

        return result.toArray(new String[result.size()][]);
    }
}
