public class Code4 {

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6 };
        int[] B = { 1, 2, 3, 4, 5, 6 };

        int[] newDieA, newDieB;
        if (nDice(A, B)) {
            newDieA = transform(A);
            newDieB = transform(B);

            System.out.println("New_Die_A: " + arrayToString(newDieA));
            System.out.println("New_Die_B: " + arrayToString(newDieB));
        }
    }

    private static boolean nDice(int[] A, int[] B) {
        double sumProbA = sumProb(A);
        double sumProbB = sumProb(B);
        return Math.abs(sumProbA - sumProbB) < 1e-9;
    }

    private static double sumProb(int[] die) {
        double sumProb = 0.0;
        for (int i = 1; i <= 12; i++) {
            sumProb += prob(die, i);
        }
        return sumProb;
    }

    private static double prob(int[] die, int targetSum) {
        int count = 0;
        for (int face1 : die) {
            for (int face2 : die) {
                if (face1 + face2 == targetSum) {
                    count++;
                }
            }
        }
        return count / 36.0;
    }

    private static int[] transform(int[] die) {
        int[] newDie = new int[die.length];
        for (int i = 0; i < die.length; i++) {
            int maxSpots = spots(die, 2 * (i + 1));
            newDie[i] = Math.min(maxSpots, 4);
        }
        return newDie;
    }

    private static int spots(int[] die, int targetSum) {
        int maxSpots = 0;
        for (int face : die) {
            if (face <= targetSum - face && face > maxSpots) {
                maxSpots = face;
            }
        }
        return maxSpots;
    }

    private static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
