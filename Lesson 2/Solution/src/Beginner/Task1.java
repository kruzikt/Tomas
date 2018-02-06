package Beginner;

public class Task1 {
    static int[] MultipleThree(int[] arr) {
        int[] newArray = new int[arr.length];

        int i=0;
        for(int stuff : arr) {
            newArray[i++] = stuff * 3;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 7, 9};

        int[] a = MultipleThree(array);

        for(int stuff : a) {
            System.out.println(stuff);
        }
    }
}
