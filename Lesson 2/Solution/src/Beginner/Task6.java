package Beginner;

public class Task6 {
    static int[] EvenValues(int[] arr) {
        int[] newArray = new int[arr.length];

        int i=0;
        for(int stuff : arr) {
            if (stuff > 0 && stuff % 2 == 0) {
                newArray[i++] = stuff;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = new int[51];

        for(int p=0;p<array.length;p++)
        {
            array[p] = p;
        }

        int[] a = EvenValues(array);

        for(int stuff : a) {
            System.out.println(stuff);
        }
    }
}
