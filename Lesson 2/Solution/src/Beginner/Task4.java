package Beginner;

public class Task4 {
    public static int contains(int[] arr, int item) {
        int count = 0;
        for (int n : arr) {
            if (item == n) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] myArray = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15, 13, 13 };
        System.out.println(contains(myArray, 13));
    }
}
