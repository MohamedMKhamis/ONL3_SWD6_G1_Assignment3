public class Task1 {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};

        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("Maximum score: " + max);

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);

        int searchValue = 92;
        boolean found = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == searchValue) {
                System.out.println("Value " + searchValue + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value " + searchValue + " not found in the array.");
        }
    }
}