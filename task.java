import java.util.ArrayList;
import java.util.Arrays;

public class task {

    public class Exception {
        public static void main(String[] args) {
            int[] arrayFirst = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] arraySecond = { 1, 1, 2, 3, 3, 2, 1, 2, 4 };
            System.out.println("The first array is " + Arrays.toString(arrayFirst));
            System.out.println("The second array is " + Arrays.toString(arraySecond));
            System.out.println("The difference between First array and Second array is "
                    + differenceArray(arrayFirst, arraySecond));
            System.out.println("The quotient of the First array and the Second array is "
                    + divideArray(arrayFirst, arraySecond));
        }

        public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
            ArrayList<Integer> res = new ArrayList<>();
            int min = Math.min(a1.length, a2.length);
            System.out.println(min);
            int max = Math.max(a1.length, a2.length);
            System.out.println(max);
            if (min < 1) {
                throw new RuntimeException("One of arrays is empty");
            }
            if (min < max) {
                throw new RuntimeException("The length of arrays is not equal");
            }
            for (int i = 0; i < min; i++) {
                res.add(a1[i] - a2[i]);
            }
            return res;
        }

        public static ArrayList<Float> divideArray(int[] a1, int[] a2) {
            ArrayList<Float> res = new ArrayList<>();
            int min = Math.min(a1.length, a2.length);
            System.out.println(min);
            int max = Math.max(a1.length, a2.length);
            System.out.println(max);
            if (min < 1) {
                throw new RuntimeException("One of arrays is empty");
            }
            if (min < max) {
                throw new RuntimeException("The length of arrays is not equal");
            }
            for (int i = 0; i < min; i++) {
                if (a2[i] != 0) {
                    res.add((float) (a1[i] / a2[i]));
                } else {
                    throw new RuntimeException("Division by zero");
                }
            }
            return res;
        }
    }
}