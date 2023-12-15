public class Code3 {
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
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                sum = i + j;
                arr[sum - 2]++;
            }
        }
        for (int i = 0; i < 11; i++) {
            int s = i + 2;
            System.out.println("The probability to make a sum of " + s + " is " + arr[i] + "/11");
        }
    }
}
