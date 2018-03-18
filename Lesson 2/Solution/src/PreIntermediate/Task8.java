package PreIntermediate;

public class Task8 {
    static boolean CheckSequence(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                if (array[i + 1] == 2) {
                    if (array[i + 2] == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[ ] args) {
        int[] array = {4, 6, 0, 1, 2, 3, 1, 9};
        boolean result = CheckSequence(array);
        System.out.println(result);

        int[] array2 = {4, 6, 4, 2, 18, 1, 2, 3};
        boolean result2 = CheckSequence(array2);
        System.out.println(result2);

        int[] array3 = {4, 6, 4, 2, 18, 1, 2, 4};
        boolean result3 = CheckSequence(array3);
        System.out.println(result3);

        int[] array4 = {4, 6, 4};
        boolean result4 = CheckSequence(array4);
        System.out.println(result4);
    }
}