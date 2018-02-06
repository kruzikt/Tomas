package Beginner;

public class Task3 {
    static boolean CheckMultiplication3Or5(int input) throws IllegalArgumentException {
        if (input < 0) {
            throw new IllegalArgumentException("Only Positive Numbers!");
        }

        else {
            int modulo3 = input % 3;
            int modulo5 = input % 5;

            if (modulo3 == 0 || modulo5 == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String args[]) {
        boolean result = CheckMultiplication3Or5(15);
        System.out.println(result);
    }
}
