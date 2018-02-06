package Beginner;

public class Task2 {
    static boolean Validate(int x, int y) {
        int sum = x + y;
        if (x == 10 || y == 10 || sum == 10) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        boolean a = Validate(0,2);
        System.out.println(a);
    }
}
