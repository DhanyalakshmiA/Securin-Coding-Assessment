public class Code2 {
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
        System.out.println("The possible combinations are:");
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                System.out.print(i + "," + j + "  ");
            }
            System.out.println(" ");
        }
    }
}
