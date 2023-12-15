public class Code1 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6 };
        int[] B = { 1, 2, 3, 4, 5, 6 };
        int len1 = 0, len2 = 0;
        for (int i : A) {
            len1++;
        }
        for (int i : B) {
            len2++;
        }
        int comb = len1 * len2;
        System.out.println("Total Number of Combinations: " + comb);
    }
}